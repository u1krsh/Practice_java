package Exam_Questions;

import java.awt.*;
import java.awt.event.*;

public class Q5_awt extends Frame {

    public Q5_awt() {
        setTitle("AWT Frame Example");
        setLayout(new FlowLayout());
        setSize(400, 300);

        setBackground(Color.CYAN);
        Label label = new Label("Welcome to AWT Window!");
        Font customFont = new Font("Arial", Font.BOLD, 18);
        label.setFont(customFont);

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");

        add(label);
        add(btn1);
        add(btn2);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Q5_awt();
    }
}
