package vista;

import javax.swing.*;
import java.awt.*;

public class PanellInicial extends JPanel {
    public PanellInicial() {
        setLayout(new BorderLayout());
        JLabel label = new JLabel("Contador V1.0", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));
        add(label, BorderLayout.CENTER);
    }
}