package unit17.swing01;

import javax.swing.*;
import java.awt.*;

public class BasicStructure extends JFrame {
    private JLabel label1;

    public BasicStructure(String title) throws HeadlessException {
        super(title);
        setTitle("adsfasdff");
        ImageIcon image = new ImageIcon("smiley2.jpg");

        label1 = new JLabel(image);
        label1.setText("my first label");
        label1.setSize(500,500);
        label1.setOpaque(true);
     //   label1.setBackground(new Color(100,200,100));
        //label1.setHorizontalTextPosition(SwingConstants.CENTER);
        //label1.setHorizontalTextPosit ion();
       // this.add(label1);
    }

    public static void main(String[] args) {
        BasicStructure basicStructure = new BasicStructure("my first frame");
        basicStructure.setVisible(true);
        basicStructure.getContentPane().setBackground(Color.RED);
        basicStructure.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        basicStructure.setSize(400, 300);
    }
}
