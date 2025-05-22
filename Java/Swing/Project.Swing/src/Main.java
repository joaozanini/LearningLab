import javax.swing.*;
import java.awt.*;

public class Main {

    // esse arquivo é apenas um teste de Swing
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tela");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);

        JButton button = new JButton("Clique Aqui!");

        button.addActionListener(e -> {
           System.out.println("Clicado!");
        });

        frame.add(button);
        frame.setVisible(true);
    }
}
