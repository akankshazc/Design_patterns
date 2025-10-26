package hf_2.swing;

import java.awt.*;
import javax.swing.*;

public class SwingObserverLambda {
    JFrame frame;

    public static void main(String[] args) {
        SwingObserverLambda exLambda = new SwingObserverLambda();
        exLambda.go();
    }

    public void go() {
        frame = new JFrame();

        JButton button = new JButton("Should i do it?");

        button.addActionListener(event -> System.out.println("Don't do it, you might regret it!"));

        button.addActionListener(event -> System.out.println("Come on, do it!"));

        // Frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, button);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
