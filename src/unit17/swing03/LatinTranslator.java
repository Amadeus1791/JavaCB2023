package unit17.swing03;

import unit17.swing01.BasicStructure;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatinTranslator extends JFrame {
    JPanel titlePanel;
    JPanel buttonPanel;
    JButton button1;
    JButton button2;
    JButton button3;
    JLabel label;
    String englishName = "";

    public LatinTranslator(String title) throws HeadlessException {
        super(title);
        // title Panel
        titlePanel = new JPanel(new FlowLayout());
        label = new JLabel("english translation: " + englishName);
        titlePanel.add(label);
        this.add(titlePanel, BorderLayout.NORTH);

        // button Panel
        buttonPanel = new JPanel();
        button1 = new JButton("Sinister");
        button2 = new JButton("Dexter");
        button3 = new JButton("Medium");
        TranslatorListener listener = new TranslatorListener();
        button1.addActionListener(listener);
        button2.addActionListener(listener);
        button3.addActionListener(listener);
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);
        add(buttonPanel, BorderLayout.CENTER);

    }

    class TranslatorListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == button1) {
                englishName = "left";
            } else if (e.getSource() == button2) {
                englishName = "right";
            } else {
                englishName = "center";
            }
            label.setText("english translation: " + englishName);
        }
    }

    public static void main(String[] args) {
        LatinTranslator basicStructure = new LatinTranslator("my first frame");
        basicStructure.setVisible(true);
        // basicStructure.getContentPane().setBackground(Color.RED);
        basicStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        basicStructure.setSize(400, 300);
    }

}
