package Calculadora.Visao;

import javax.swing.*;
import java.awt.*;

public class Calculadora  extends JFrame {

    public Calculadora() {
        OrganizarLayout();

        setTitle("Calculadora");
        setSize(232, 322);
        setBackground(Color.DARK_GRAY);
        setUndecorated(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void OrganizarLayout() {
        setLayout(new BorderLayout());
        Display display = new Display();
        display.setPreferredSize(new Dimension(233, 62));
        add(display, BorderLayout.NORTH);

        Teclado teclado = new Teclado();
        add(teclado, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
