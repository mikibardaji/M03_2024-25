/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Model.DAOImatges;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author usuari
 */
public class PanelPrincipal extends JPanel implements ActionListener{
    private JLabel etiquetaImatge;
    DAOImatges model;
    ActionListener listener;
    
    public PanelPrincipal() {
        model = new DAOImatges();
        listener = this;
        initComponents();
        
    }

    private void initComponents() {
        
        setLayout(new BorderLayout());
/*
        // Zona on es mostra la imatge
        etiquetaImatge = new JLabel();
        etiquetaImatge.setHorizontalAlignment(JLabel.CENTER);
        carregarImatge(model.getImatgeActual());
        add(etiquetaImatge, BorderLayout.CENTER);

        // Botó per canviar la imatge
        JButton botoCanviar = new JButton("Canviar imatge");
      /*  botoCanviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Canviem la imatge a la següent (cíclicament)
                carregarImatge(model.carregarNovaImatge());
            }
        });
        botoCanviar.addActionListener(listener);

        add(botoCanviar, BorderLayout.SOUTH);*/
        carregarNovaImatge(model.getImatgeActual(),false);

        // Botó per canviar la imatge
        JButton botoCanviar = new JButton("Canviar imatge");
        botoCanviar.addActionListener(listener);

        add(botoCanviar, BorderLayout.SOUTH);
    };
    
    
    private void carregarImatge(String ruta) {
//        ImageIcon icona = new ImageIcon(ruta);
//        // Redimensionem la imatge perquè s’adapti a l’espai
//        Image imatge = icona.getImage().getScaledInstance(300, 300, Image.SCALE_SMOOTH);
//        etiquetaImatge.setIcon(new ImageIcon(imatge));
            carregarNovaImatge(ruta, true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //no hem fa falta preguntar per actionComand perque 
        //per ara sol hi ha un component que te listener
                        // Canviem la imatge a la següent (cíclicament)
                carregarImatge(model.carregarNovaImatge());
                System.out.println("carregada");
                validate();
    }

    private void carregarNovaImatge(String img, boolean par) {
        PanellImatgeAmbX panellImatge = new PanellImatgeAmbX();
        panellImatge.setPreferredSize(new Dimension(400, 400));
        
        Runnable carregarImatge = () -> {
        ImageIcon icona = new ImageIcon(img);
        Image imatge = icona.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH);
        panellImatge.setImatge(imatge);
        panellImatge.activarX(par); // Aquí activem la X
        };
        carregarImatge.run(); // Inicialitza amb la primera imatge
        add(panellImatge, BorderLayout.CENTER);
    }
    
    
    
}
