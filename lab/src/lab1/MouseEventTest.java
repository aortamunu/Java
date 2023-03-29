package lab1;
import javax.swing.*;
import java.awt.event.*;
import java.util.Random;

public class MouseEventTest implements MouseListener {
    JButton b;
    JFrame f;
    public MouseEventTest(){
        f = new JFrame("Catch me test");
        b = new JButton("Catch Me");
        b.setBounds(20, 20, 150, 20);
        b.addMouseListener(this);
        f.add(b);
        f.setSize(600, 600);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new MouseEventTest();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        Random r = new Random();
        int x = r.nextInt(150, 450);
        int y = r.nextInt(0, 580);
        b.setBounds(x, y, 150, 20);
    }

    public void mouseClicked(MouseEvent e){

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
