package unit17.challenges;

import unit17.swing02.ButtonFrame;
import unit17.swing02.ButtonListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Challenge01RandomColorBackground extends JFrame {


    JButton button1;
    JButton button2;
    int counter = 0;

    public Challenge01RandomColorBackground(String title) throws HeadlessException {
        super(title);
        button1 = new JButton("Change color");
        ButtonListener btnListener = new ButtonListener();
        button2 = new JButton("Exit button");
        button1.addActionListener(new ChangeBackGroundButtonListener());
        button2.addActionListener(new ChangeBackGroundButtonListener());
        setLayout(new FlowLayout());

        add(button1);
        add(button2);
    }

    class ChangeBackGroundButtonListener implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button2) {
                System.exit(0);
            }
            if (counter < 10) {
                counter++;
                Random random = new Random();
                int r = random.nextInt(256);
                int g = random.nextInt(256);
                int b = random.nextInt(256);
                Color randomColor = new Color(r, g, b);

                getContentPane().setBackground(randomColor);
            } else {
                button1.setEnabled(false);
            }
        }
    }

    public static void main(String[] args) {
        Challenge01RandomColorBackground basicStructure = new Challenge01RandomColorBackground("my first frame");
        basicStructure.setVisible(true);
        //basicStructure.getContentPane().setBackground(Color.RED);
        basicStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        basicStructure.setSize(400, 300);
    }
}


