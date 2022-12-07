import javax.swing.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

class ThisPanel extends JPanel{
    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Image picture_block = new ImageIcon("beetle.jpg").getImage();
        Image picture_rabbit = new ImageIcon("yellow_block").getImage();
        g2d.drawImage(picture_block, 0, 0,50, 50, 0, 0, 100, 20, null);
    }
}
class Help{
    public static void main(String[] args) {
        JFrame window = new JFrame("Super-puper gaaaame");
        window.setSize(400, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        ThisPanel panel = new ThisPanel();

        panel.setFocusable(true);
    }
}
