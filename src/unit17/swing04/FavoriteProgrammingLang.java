package unit17.swing04;

import unit17.swing01.BasicStructure;

import javax.swing.*;
import java.awt.*;

public class FavoriteProgrammingLang extends JFrame {
    JPanel radioButtonPanel;
    JPanel okPanel;
    String[] btnText = {"Java", "C++", "Python", "C#", "Javascript"};
    JRadioButton[] radioButtons;
    ButtonGroup group;

    public FavoriteProgrammingLang(String title) throws HeadlessException {
        super(title);
        radioButtonPanel = new JPanel(new GridLayout(0, 1));
        radioButtons = new JRadioButton[btnText.length];
        group = new ButtonGroup();
        for (int i = 0; i < radioButtons.length; i++) {
            radioButtons[i] = new JRadioButton(btnText[i]);
            radioButtonPanel.add(radioButtons[i]);
            group.add(radioButtons[i]);
        }
        add(radioButtonPanel);
    }

    public static void main(String[] args) {
        FavoriteProgrammingLang basicStructure = new FavoriteProgrammingLang("my first frame");
        basicStructure.setVisible(true);
        basicStructure.getContentPane().setBackground(Color.RED);
        basicStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        basicStructure.setSize(400, 300);
    }
}
