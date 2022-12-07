import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.Random;

class MyPanel extends JPanel {

    @Override
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        Image fon = new ImageIcon("src/fon.png").getImage();
        g2d.drawImage(fon, 0, 0, 600, 600, null);
        g2d.setColor(Color.orange);
        g2d.fillRect(590, 0, 10, 600);
        g2d.fillRect(0, 0, 600, 10);
        g2d.fillRect(0, 0, 10, 600);
        g2d.fillRect(0, 590, 600, 10);

        for (int i = 0; i <= Main.m - 1; i++){
            g2d.fillRect(Main.A[i][0], Main.A[i][1], Main.A[i][2], Main.h);
            //вот сюда надо вставить картинку
        }
        g2d.setColor(Color.magenta);
        Image hedgehog = new ImageIcon("src/ёжик.png").getImage();
        g2d.drawImage(hedgehog, Main.x1, Main.y1, 2 * Main.r1,2 * Main.r1, null);
        g2d.drawImage(hedgehog, Main.x2, Main.y2, 2 * Main.r2,2 * Main.r2, null);
        String inscription = Main.strscore + " " + Main.score1 + ":" + Main.score2;
        g2d.setColor(Color.black);
        g2d.drawString(inscription, 50, 50);
    }
}

public class Main {
    static int[][] A = {{0, 590, 600}, {160, 560, 70}, {210, 540, 70}, {270, 505, 70}, {190, 480, 70}, {150, 460, 70}, {350, 520, 70},
            {420, 490, 70}};
    static int[][] B = {{500, 580, 5, 0, 0}, {200, 580, 5, 0, 0}};
    static int x1 = 500, y1 = 580, r1 = 10, vx1 = 0, vy1 = 0;
    static int score1 = 0;
    static int already_credited1 = 0;
    static int already_credited2 = 0;
    static int score2 = 0;


    static Audio jump = new Audio("src/cartoon-spring-boing-01.WAV", 0.68);
    static int x2 = 200, y2 = 580, r2 = 10, vx2 = 0, vy2 = 0;
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
    public static int f1(int i){
        int x0, y0, l0;
        x0 = A[i][0];
        y0 = A[i][1];
        l0 = A[i][2];
        if (x1 + r1 >= x0 && x1 + r1 <= x0 + l0){
            if (y1 + 2 * r1 >= y0 && y1 <= y0){
                return 1; //сверху соприкасается
            }
            if (y1 <= y0 + h && y1 + 2 * r1 >= y0 - h){
                return 2; //снизу соприкасается
            }
        }
        return 0; //не соприкасается
    }
    public static int f2(int i){
        int x0, y0, l0;
        x0 = A[i][0];
        y0 = A[i][1];
        l0 = A[i][2];
        if (x2 + r2 >= x0 && x2 + r2 <= x0 + l0){
            if (y2 + 2 * r2 >= y0 && y2 <= y0){
                return 1; //сверху соприкасается
            }
            if (y2 <= y0 + h && y2 + 2 * r2 >= y0 - h){
                return 2; //снизу соприкасается
            }
        }
        return 0; //не соприкасается
    }
    public static int g1(){ //падает первый
        int x0, y0, l0;
        x0 = x2;
        y0 = y2;
        l0 = 2 * r2;
        if (x1 + r1 >= x0 && x1 + r1 <= x0 + l0 && vy1 < 0) {
            if (y1 <= y0 + 2 * r2 && y1 + 2 * r1 >= y0 - 2 * r2) {
                return 1;
            }
        }
        return 0;
    }
    public static int g2(){ //падает второй
        int x0, y0, l0;
        x0 = x1;
        y0 = y1;
        l0 = 2 * r1;
        if (x2 + r2 >= x0 && x2 + r2 <= x0 + l0 && vy2 < 0) {
            if (y2 <= y0 + 2 * r1 && y2 + 2 * r2 >= y0 - 2 * r1) {
                return 1;
            }
        }
        return 0;
    }
    static Timer timer;

    public static void main(String[] args) {
        JFrame window = new JFrame("Super-puper gaaaame");
        window.setSize(400, 600);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        MyPanel panel = new MyPanel();

        panel.setFocusable(true);
        panel.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    vx1 = 2;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    vx1 = -2;
                }
                if (e.getKeyCode() == KeyEvent.VK_UP){
                    int t = 0;
                    for (int i = 0; i <= m - 1; i++){
                        if (f1(i) == 1){
                            t = 1;
                        }
                    }
                    if (t == 1){
                        vy1 = 12;
                        Main.jump.sound();
                        Main.jump.setVolume();
                    }
                }
                if (e.getKeyCode() == KeyEvent.VK_D){
                    vx2 = 2;
                }
                if (e.getKeyCode() == KeyEvent.VK_A){
                    vx2 = -2;
                }
                if (e.getKeyCode() == KeyEvent.VK_W){
                    int t = 0;
                    for (int i = 0; i <= m - 1; i++){
                        if (f2(i) == 1){
                            t = 1;
                        }
                    }
                    if (t == 1){
                        vy2 = 12;
                        Main.jump.sound();
                        Main.jump.setVolume();
                    }
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    vx1 = 0;
                }
                if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    vx1 = 0;
                }
                if (e.getKeyCode() == KeyEvent.VK_D){
                    vx2 = 0;
                }
                if (e.getKeyCode() == KeyEvent.VK_A){
                    vx2 = 0;
                }
            }
        });

        window.add(panel);
        window.setVisible(true);


        timer = new Timer(1, (e) -> {
            if (vx1 < 0 && x1 <= 0){
                vx1 = 0;
                x1 = 0;
            }
            if (x1 + 2 * r1 >= 590 && vx1 > 0){
                vx1 = 0;
                x1 = 590 - 2 * r1;
            }
            x1 += vx1;
            int o = 0;
            for (int j = 0; j <= m - 1; j++){
                if (f1(j) == 1){
                    o = 1;
                    if (vy1 <= 0){
                        vy1 = 0;
                        y1 = A[j][1] - 2 * r1;
                    }
                }
                if (f1(j) == 2){
                    if (vy1 >= 0){
                        y1 = A[j][1] + h;
                        vy1 = -1 * vy1;
                    }
                }
            }
            y1 -= vy1;
            if (o == 0){
                vy1 -= g;
            }


            if (vx2 < 0 && x2 <= 0){
                vx2 = 0;
                x2 = 0;
            }
            if (x2 + 2 * r2 >= 590 && vx2 > 0){
                vx2 = 0;
                x2 = 590 - 2 * r2;
            }
            x2 += vx2;
            o = 0;
            for (int j = 0; j <= m - 1; j++){
                if (f2(j) == 1){
                    o = 1;
                    if (vy2 <= 0){
                        vy2 = 0;
                        y2 = A[j][1] - 2 * r2;
                    }
                }
                if (f2(j) == 2){
                    if (vy2 >= 0){
                        y2 = A[j][1] + h;
                        vy2 = -1 * vy2;
                    }
                }
            }
            y2 -= vy2;
            if (o == 0){
                vy2 -= g;
            }
            if (y1 > 580){
                vy1 = 0;
                y1 = 580;
            }
            if (y2 > 580){
                vy2 = 0;
                y2 = 580;
            }
            if (g1() == 1){
                score1 += 1;
                if (x2 != 200) {
                    x2 = 200;
                }
                else{
                    x2 = 500;
                }
                y2 = 580;
                vx2 = 0;
                vy2 = 0;
            }
            if (g2() == 1){
                score2 += 1;
                if (x1 != 500) {
                    x1 = 500;
                }
                else{
                    x1 = 200;
                }
                y1 = 580;
                vx1 = 0;
                vy1 = 0;
            }
            window.repaint();
        });
        timer.start();
    }
}
