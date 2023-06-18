package unit17.swing02;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonFrame extends JFrame {
    JButton button1;
    JButton button2;

    public ButtonFrame(String title) throws HeadlessException {
        super(title);
        button1 = new JButton("Click me");
        ButtonListener btnListener = new ButtonListener();
        button1.addActionListener(btnListener);
        button2 = new JButton("Exit");
        button2.addActionListener(btnListener);
        setLayout(new FlowLayout());

        add(button1);
        add(button2);
    }



    public static void main(String[] args) {
        ButtonFrame basicStructure = new ButtonFrame("my first frame");
        basicStructure.setVisible(true);
        //basicStructure.getContentPane().setBackground(Color.RED);
        basicStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        basicStructure.setSize(400, 300);
    }
}
