package unit19.drawingInSwing;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class IntroDrawShapes extends JFrame {

    String[] figures = {"Circle",  "Ellipse", "Rectangle","Cube"};
    JRadioButton[] butns = new JRadioButton[4];
    int xpos;
    int ypos;
    ButtonGroup btnGroup;
    public IntroDrawShapes(){
        // setLayout(new FlowLayout());

        JPanel btnPanel = new JPanel();
        btnGroup = new ButtonGroup();
        for (int i = 0; i < figures.length; i++) {
            butns[i] = new JRadioButton(figures[i]);
            btnGroup.add(butns[i]);
            btnPanel.add(butns[i]);
        }

        add(new Intro1Panel());
        add(btnPanel,BorderLayout.NORTH);
    }

    private class Intro1Panel extends JPanel {

        protected void paintComponent(Graphics g) {
            super.paintComponent(g);

            if(butns[0].isSelected()) {
                g.drawOval(xpos,ypos,50,50);
            } else if (butns[1].isSelected()) {
                g.drawOval(xpos,ypos,50,10);
            } else if (butns[2].isSelected()){
                g.drawRect(xpos,ypos,50,100);
            } else
                g.drawRect(xpos,ypos,50,50);
            repaint();
        }

        public Intro1Panel() {
            this.addMouseListener(new MouseAdapter() {
                @Override
                public void mousePressed(MouseEvent e) {
                    xpos = e.getX();
                    ypos = e.getY();
                }
            });
        }
    }




    public static void main(String[] args) {
        IntroDrawShapes intro1 = new IntroDrawShapes();
        intro1.setSize(400,600);
        intro1.setVisible(true);
        intro1.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}


