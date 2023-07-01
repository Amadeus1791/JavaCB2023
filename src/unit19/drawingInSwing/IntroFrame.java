package unit19.drawingInSwing;

import javax.swing.*;
import java.awt.*;

public class IntroFrame extends JFrame {


    public IntroFrame() throws HeadlessException {
        add(new IntroPanel(), BorderLayout.CENTER);
    }

    private class IntroPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(Color.BLACK);
            g.fillRect(100,80,110,100);
            g.setColor(Color.GREEN);
            g.setFont(new Font("Arial", Font.BOLD, 20));
            g.drawString("Hi there", 100, 100);

            //     g.drawLine(10,10,100,100);
        }
    }


    public static void main(String[] args) {
        IntroFrame frame = new IntroFrame();
        frame.setSize(400, 600);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
