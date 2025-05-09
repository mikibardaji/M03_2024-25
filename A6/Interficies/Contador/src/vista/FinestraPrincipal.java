package vista;

import javax.swing.*;
import java.awt.event.*;

public class FinestraPrincipal extends JFrame implements ActionListener {

    ActionListener listener;
    public FinestraPrincipal() {
        listener = this;
        setTitle("Aplicació Contador");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        carregarPanellInicial();

        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Opcions");
        
        JMenuItem itemInicial = new JMenuItem("Panell inicial");
        itemInicial.setActionCommand("inicial");
        itemInicial.addActionListener(listener);
        
        JMenuItem itemContador = new JMenuItem("Obrir contador");
        itemContador.setActionCommand("contador");
        itemContador.addActionListener(listener);

        JMenuItem itemExit = new JMenuItem("Exit");
        itemExit.setActionCommand("exit");
        itemExit.addActionListener(listener);
        menu.add(itemInicial);
        menu.add(itemContador);
         menu.add(itemExit);
        menuBar.add(menu);
        setJMenuBar(menuBar);

        setVisible(true);
    }

    private void carregarPanellInicial() {
        //getContentPane().removeAll();
        setContentPane(new PanellInicial());
        //add(new PanellInicial());
        validate();
        //repaint();
    }

    private void carregarPanellContador() {
        //getContentPane().removeAll();
        setContentPane(new PanellContador());
        //add(new PanellContador());
        validate();
        //repaint();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand())
        {
            case "inicial":
                carregarPanellInicial();
                break;
            case "contador":
                carregarPanellContador();
                break;
            case "exit":
                System.exit(0);
                break;
        }
             
    }
}