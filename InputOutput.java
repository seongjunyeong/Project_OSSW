import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InputOutput extends JFrame {
    int getx;
    int gety;
    JLabel card1 = new JLabel();
    public InputOutput(){

        setTitle("swing연습");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        addMouseListener(new MyMouse());
        addMouseMotionListener(new MyMouseDragged());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.gray);
        add(card1);
        card1.addMouseListener(new MyMouse());
        card1.addMouseMotionListener(new MyMouseDragged());
        card1.setBackground(Color.white);
        card1.setSize(50,100);
        card1.setLocation(100, 100);
        card1.setVisible(true);

    }
    public class MyMouse extends MouseAdapter{
        public void mouseClicked(MouseEvent e){
            getx = e.getX();
            gety = e.getY();
        }
        public void mouseReleased(MouseEvent e){
            getx = e.getX();
            gety = e.getY();
        }
    }
    public class MyMouseDragged extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            getx = e.getX();
            gety = e.getY();
        }
    }
    public static void main(String[] args){
        InputOutput MainFrame = new InputOutput();
    }
}
