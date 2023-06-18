package unit17.swing02;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ButtonListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Click me")) {
            System.out.println(e.getActionCommand());
            System.out.println(e.getSource().toString());
            JOptionPane.showMessageDialog(null, "You just pressed a button");
        } else {
            System.exit(0);
        }

    }
}
