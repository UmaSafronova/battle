import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

class MyPanel1 extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        Image image = new ImageIcon("src/happy_integral.png").getImage();
        g2d.drawImage(image, 50, 50, 100, 100, null);
    }
}

public class Happy_integral {
    static int[][] A = {{0, 590, 600}, {160, 560, 70}, {210, 540, 70}, {270, 505, 70}, {190, 480, 70}, {150, 460, 70}, {350, 520, 70},
            {420, 490, 70}};
    static int[][] B = {{500, 580, 5, 0, 0}, {200, 580, 5, 0, 0}};
    static int x1 = 500, y1 = 580, r1 = 5, vx1 = 0, vy1 = 0;
    static int score1 = 0;
    static int already_credited1 = 0;
    static int already_credited2 = 0;
    static int score2 = 0;


    static Audio jump = new Audio("src/cartoon-spring-boing-01.WAV", 0.68);
    static int x2 = 200, y2 = 580, r2 = 5, vx2 = 0, vy2 = 0;
    static String[] UP = {"VK_UP", "VK_W"};
    static String[] R = {"VK_RIGHT", "VK_D"};
    static String[] L = {"VK_LEFT", "VK_A"};
    static int m = A.length;
    static int n = B.length;
    static int h = 10;
    static int g = 1;
    static String strscore = "Score";
    static String strscore1 = Integer.toString(score1);
    static String strscore2 = Integer.toString(score2);

    public static void main(String[] args) {
        JFrame window = new JFrame("Super-puper gaaaame");
        window.setSize(400, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyPanel1 panel = new MyPanel1();

        panel.setFocusable(true);


        window.add(panel);
        window.setVisible(true);


    }
}
