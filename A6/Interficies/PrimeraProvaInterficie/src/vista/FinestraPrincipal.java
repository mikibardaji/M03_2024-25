/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author mabardaji
 */
public class FinestraPrincipal extends JFrame implements ActionListener{

    JTextField textoEntrada;
    PanelRadioButtons opciones_conversion;
    //escoltar per la finestra JFRame (si això fos diferents panells a cada Jpanell hauria
    // de ficar un listener
    private ActionListener listener;
    private ActionListener lis1;

    public FinestraPrincipal(String title){
        //degut a que el JFrame te implements ActionListener
        listener = this;

        lis1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Soy independiente");
            }
        };
        initComponents(title);
    }

    private void initComponents(String title) {
        this.setTitle(title);
        this.setSize(80, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        afegirComponents();
        this.setVisible(true); //ultima linea
    }

    /** components que estaran dins la finestra*/
    private void afegirComponents() {
        
        
        //disposicioFlowLayout();
        //disposicioBorderLayout();
        //disposicioGridLayout();
        disposicioMixConversorMoneda();
        crearMenu();

    }

    private void disposicioFlowLayout() {
                //definin amb quina disposicio volem colocar-los
        //flowLayout Dispone los componentes en filas de izquierda a derecha
        this.getContentPane().setLayout(new FlowLayout());
        
        
        JLabel etiqueta = new JLabel("Posa el teu nom");
        this.getContentPane().add(etiqueta);
        JTextField input = new JTextField("Miquel Angel");
        this.getContentPane().add(input);
        JButton boto = new JButton("Apreta'm");
        this.getContentPane().add(boto, FlowLayout.CENTER);
        JButton boto2 = new JButton("Boto2");
        this.getContentPane().add(boto2);
    }

    /**
     * Divide un contenedor en cinco secciones: norte, sur, este, oeste y centro. Cada región solo puede contener un componente y es identificada por la constante correspondiente:
NORTH, SOUTH, EAST, WEST, CENTER.
     */
    private void disposicioBorderLayout() {
        this.getContentPane().setLayout(new BorderLayout());
        JLabel etiqueta = new JLabel("Posa el teu nom");
        this.getContentPane().add(etiqueta, BorderLayout.NORTH);
        JButton boto2 = new JButton("Boto2");
        this.getContentPane().add(boto2, BorderLayout.SOUTH);
        JTextField input = new JTextField("...");
        this.getContentPane().add(input, BorderLayout.CENTER);
        JRadioButton radio = new JRadioButton("Opcio1");
        this.getContentPane().add(radio, BorderLayout.EAST);
        JCheckBox check = new JCheckBox("Opcio1");
        this.getContentPane().add(check, BorderLayout.WEST);
        //BorderLayout.North, 
        
        
    }

    private void disposicioGridLayout() {
            this.getContentPane().setLayout(new GridLayout(3,2));
       //grupButton 
        JRadioButton radio1 = new JRadioButton("Dolares");
        this.getContentPane().add(radio1);
        JButton boto1 = new JButton("Calcular");
        this.getContentPane().add(boto1);
        JRadioButton radio2 = new JRadioButton("Euros");
        this.getContentPane().add(radio2);
        JButton boto2 = new JButton("Reset");
        this.getContentPane().add(boto2);
        JTextField input = new JTextField();
        this.getContentPane().add(input);              
        JButton boto3 = new JButton("Enviar");
        this.getContentPane().add(boto3);
        
    }

    private void disposicioMixConversorMoneda() {
        this.getContentPane().setLayout(new BorderLayout());
        
        
        textoEntrada = new JTextField("pon numero");
        this.getContentPane().add(textoEntrada, BorderLayout.CENTER);
        
        JButton conversor = new JButton("Calcular!!!");
        conversor.setActionCommand("convertir");
        conversor.addActionListener(listener);
    //    conversor.addMouseWheelListener(l);
        this.getContentPane().add(conversor, BorderLayout.SOUTH);
        
        
        
       // PanelRadioButtons opciones_conversion = new PanelRadioButtons();
        opciones_conversion = new PanelRadioButtons();
                
        this.getContentPane().add(opciones_conversion, BorderLayout.NORTH);
        PanelRadioButtons opciones_conversion2 = new PanelRadioButtons();
        this.getContentPane().add(opciones_conversion2, BorderLayout.EAST);
                
    }

    private void crearMenu() {
        JMenuBar menuBar = new JMenuBar(); //això es la barra
        
         
        JMenu menu = new JMenu("File");
        JMenuItem newMenu = new JMenuItem("New..");  
        newMenu.setActionCommand("new");
        newMenu.addActionListener(listener);
        menu.add(newMenu); //afegeixo items al menú
        JMenuItem newExit = new JMenuItem("Exit..");
        //afegir el listener, la varible que l'escoltarà..
        newExit.setActionCommand("exit");
        newExit.addActionListener(listener);
        menu.add(newExit); //afegeixo items al menú
        menuBar.add(menu);
        
        
        //segona opcio menú
        JMenu menuCalc = new JMenu("Calc");
        JMenuItem newConvert = new JMenuItem("Convert");
        menuCalc.add(newConvert);
        menuBar.add(menuCalc);
        //Help
        JMenu menuHelp = new JMenu("Help");
        JMenuItem newAbout = new JMenuItem("About");
        //afegir el listener i la comanda 
        newAbout.addActionListener(listener);
        newAbout.setActionCommand("about");
        
        menuHelp.add(newAbout);
        menuBar.add(menuHelp);
        
        //JFrame
        this.setJMenuBar(menuBar);
        
    }

    //metodo que saltara si estamos en el jframe
    //para todos los componentes que se lo hayamos asignado
    @Override
    public void actionPerformed(ActionEvent e) {
        String actionComand = e.getActionCommand();
        switch(actionComand)
        {
            case "exit":
                System.exit(0);
                break;
            case "about":
                showAboutDialog();
                break;
            case "convertir":
                convertirCash();
                break;
            default:
               System.out.println("Has apretat--> " + e.getActionCommand()); 
        }
        
    }

    private void showAboutDialog() {
        //això retorna un valor
        //no el recollim
        JOptionPane.showMessageDialog(this, 
                "Creat per DAW",
                "About...",
                JOptionPane.YES_NO_CANCEL_OPTION); //2 botons ok i cancel
                //JOptionPane.INFORMATION_MESSAGE);
                //
//        JOptionPane.showConfirmDialog(this, 
//                "Creat per DAW",
//                "About...",
//                JOptionPane.OK_CANCEL_OPTION);
        
    }

    /*conversio de monedes*/
    private void convertirCash() {
        System.out.println("conviertiendo  " + textoEntrada.getText());
        Double moneda_convertida;
        //NO ANIRIA AQUI
        moneda_convertida = Double.parseDouble(textoEntrada.getText());
       // moneda_convertida = moneda_convertida/2;
        if (opciones_conversion.getDolar().isSelected())
        {
            moneda_convertida = moneda_convertida/2;
        }
        else if (opciones_conversion.getEuro().isSelected())
        {
            moneda_convertida = moneda_convertida*2;
        }
        else
        {
            moneda_convertida = moneda_convertida+1;
        }
        textoEntrada.setText(String.valueOf(moneda_convertida));
    }
    
    
}
