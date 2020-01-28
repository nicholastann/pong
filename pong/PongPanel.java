import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
import java.awt.Font;
import java.util.Random;

public class PongPanel extends JPanel implements ActionListener, KeyListener {
    int leftpaddley = 425;
    boolean upPressed = false;
    boolean downPressed = false;
    int ballx = 500;
    int bally = 500;
    int rightpaddley = 425;
    boolean up2Pressed = false;
    boolean down2Pressed = false;
    int ballspeedx = 1;
    int ballspeedy = 0;
    int rightscore = 0;
    int leftscore = 0;
    boolean players = false;
    boolean player = false;
    boolean bots = false;
    Timer timer = new Timer (1000/60, this);

    public PongPanel() {
        setBackground(Color.BLACK);
        setFocusable(true);
        addKeyListener(this);

        timer.start();
    }

    public void paintComponent(Graphics g)  {
        super.paintComponent(g);

        g.setFont(new Font("Arial", Font.BOLD, 36));
        g.setColor(Color.WHITE);
        g.drawRect(75, 100, 500, 250);
        g.drawString("press 1 to play by yourself", 100, 200);
        g.drawRect(75, 400, 500, 250);
        g.drawString("press 2 to play with a friend", 100, 500);
        g.drawRect(75, 700, 500, 250);
        g.drawString("press 0 to watch some bots", 100, 800);

        if (player == true) {
            if ((leftscore < 11) && (rightscore < 11)) {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 1000, 1000);
                g.setColor(Color.WHITE);
                g.fillRect(950, rightpaddley , 25 , 150);
                g.fillOval(ballx, bally, 15, 15);
                g.fillRect(50, leftpaddley, 25, 150);
                g.setFont(new Font("ComicSans", Font.BOLD, 25));
                g.drawString("Bot", 100, 100);
                g.drawString("Player", 700, 100);
                g.setFont(new Font("ComicSans", Font.BOLD, 125));
                g.drawString(" " +leftscore, 100, 200);
                g.drawString(" " + rightscore, 700, 200);
                g.fillRect(495, 0, 10, 1000);
            }

            else {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 1000, 1000);
                Font myfont = new Font("Serif", Font.BOLD, 50);
                g.setFont(myfont);
                for (int i=0; i< 100; i++) {
                    int R = 200;
                    int B = 255;
                    int G = 200;

                    int x = (int)(Math.random() * 1000 + 1);
                    int y = (int)(Math.random() * 1000 + 1);
                    int a = (int)(Math.random() * 4);

                    g.setColor(new Color(R, G, B));
                    g.fillOval(x , y , a, a);
                    repaint();
                }
                if (leftscore == 11) {
                    g.setColor(Color.WHITE);
                    g.drawString("The AI Beat You :(", 450, 300);
                }
                if (rightscore == 11) {
                    g.setColor(Color.WHITE);
                    g.drawString("You Won!", 350, 300);
                }
                timer.stop();
            }

        }
        if (bots == true) {
            if ((leftscore < 11) && (rightscore < 11)) {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 1000, 1000);
                g.setColor(Color.WHITE);
                g.fillRect(950, rightpaddley , 25 , 150);
                g.fillOval(ballx, bally, 15, 15);
                g.fillRect(50, leftpaddley, 25, 150);
                g.setFont(new Font("ComicSans", Font.BOLD, 25));
                g.drawString("Bot 1", 100, 100);
                g.drawString("BOT 2", 700, 100);
                g.setFont(new Font("ComicSans", Font.BOLD, 125));
                g.drawString(" " +leftscore, 100, 200);
                g.drawString(" " + rightscore, 700, 200);
                g.fillRect(495, 0, 10, 1000);
            }

            else {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 1000, 1000);
                Font myfont = new Font("Serif", Font.BOLD, 20);
                g.setFont(myfont);
                for (int i=0; i< 100; i++) {

                    int R = (int)(Math.random() * 99);
                    int G = (int)(Math.random() * 100);
                    int B = (int)(Math.random() * 101);
                    
                    int x = (int)(Math.random() * 1000 + 1);
                    int y = (int)(Math.random() * 1000 + 1);
                    int a = (int)(Math.random() * 20);

                    g.setColor(new Color(R, G, B));
                    g.fillOval(x , y , a, a);
                    repaint();

                }
                if (leftscore == 11) {
                    g.setColor(Color.WHITE);
                    g.drawString("CONGRATS YOU LEFT THE GAME RUNNING A VERY LONG TIME!", 250, 300);
                }
                if (rightscore == 11) {
                    g.setColor(Color.WHITE);
                    g.drawString("CONGRATS YOU LEFT THE GAME RUNNING A VERY LONG TIME!", 250, 300);
                }
                timer.stop();
            }

        }
        if (players == true) {
            if ((leftscore < 11) && (rightscore < 11)) {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 1000, 1000);
                g.setColor(Color.WHITE);
                g.fillRect(950, rightpaddley , 25 , 150);
                g.fillOval(ballx, bally, 15, 15);
                g.fillRect(50, leftpaddley, 25, 150);
                g.setFont(new Font("ComicSans", Font.BOLD, 25));
                g.drawString("Left Player", 100, 100);
                g.drawString("Right Player", 700, 100);
                g.setFont(new Font("ComicSans", Font.BOLD, 125));
                g.drawString(" " +leftscore, 100, 200);
                g.drawString(" " + rightscore, 700, 200);
                g.fillRect(495, 0, 10, 1000);
            }

            else {
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 1000, 1000);
                Font myfont = new Font("Serif", Font.BOLD, 50);
                g.setFont(myfont);
                for (int i=0; i< 100; i++) {
                    int R = 200;
                    int B = 255;
                    int G = 200;

                    int x = (int)(Math.random() * 1000 + 1);
                    int y = (int)(Math.random() * 1000 + 1);
                    int a = (int)(Math.random() * 4);

                    g.setColor(new Color(R, G, B));
                    g.fillOval(x , y , a, a);
                    repaint();

                }
                if (leftscore == 11) {
                    g.setColor(Color.WHITE);
                    g.drawString("Left Player Won!", 350, 300);
                }
                if (rightscore == 11) {
                    g.setColor(Color.WHITE);
                    g.drawString("Right Player Won!", 350, 300);
                }
                timer.stop();
            }

        }
    }

    public void actionPerformed(ActionEvent e) {
        if (ballspeedx == 1) {
            ballx = ballx + 5;
        }
        if (ballspeedx == 2) {
            ballx = ballx + 8;
        }
        if (ballspeedx == 3) {
            ballx = ballx + 11;
        }
        if (ballspeedx == 4) {
            ballx = ballx + 14;
        }
        if (ballspeedx == 5) {
            ballx = ballx + 17;
        }
        if (ballspeedx == 6) {
            ballx = ballx + 20;
        }
        if (ballspeedx == 7) {
            ballx = ballx + 23;
        }
        if (ballspeedx == 8) {
            ballx = ballx + 26;

        }
        if (ballspeedx == 9) {
            ballx = ballx + 29;

        }
        if (ballspeedx == 10) {
            ballx = ballx + 32;
            ballspeedx = 9;
        }

        if (ballspeedy == 1) {
            bally = bally + 5;
        }
        if (ballspeedy == 2) {
            bally = bally + 10;
        }

        if (ballspeedy == 3) {
            bally = bally + 15;
        }

        if (ballspeedx == -1) {
            ballx = ballx - 5;
        }
        if (ballspeedx == -2) {
            ballx = ballx - 8;
        }
        if (ballspeedx == -3) {
            ballx = ballx - 11;
        }
        if (ballspeedx == -4) {
            ballx = ballx - 14;
        }
        if (ballspeedx == -5) {
            ballx = ballx - 17;
        }
        if (ballspeedx == -6) {
            ballx = ballx - 20;
        }
        if (ballspeedx == -7) {
            ballx = ballx - 23;
        }
        if (ballspeedx == -8) {
            ballx = ballx - 26;
        }
        if (ballspeedx == -9) {
            ballx = ballx - 29;
        }
        if (ballspeedx == -10) {
            ballx = ballx - 32;
            ballspeedx = -9;
        }

        if (ballspeedy == -1) {
            bally = bally - 5;
        }
        if (ballspeedy == -2) {
            bally = bally - 10;
        }
        if (ballspeedy == -3) {
            bally = bally - 15;
        }

        if (ballx > 950) {
            ballspeedx++;
            if (( bally >= rightpaddley + 50 ) &&  (bally < rightpaddley + 100)) {
                ballspeedx = ballspeedx * -1;
                ballspeedy = 0;
            }
            if (( bally >= rightpaddley) &&  (bally < rightpaddley + 50)) {
                ballspeedx = ballspeedx * -1;
                ballspeedy = -1;
            }
            if (( bally >= rightpaddley + 100) &&  (bally < rightpaddley + 150)) {
                ballspeedx = ballspeedx * -1;
                ballspeedy = 1;
            }

        }
        if (ballx < 65) {
            ballspeedx--;
            if (( bally >= leftpaddley + 50 ) &&  (bally < leftpaddley + 100)) {
                ballspeedx = ballspeedx * -1;
                ballspeedy = 0;
            }
            if (( bally >= leftpaddley) &&  (bally < leftpaddley + 50)) {
                ballspeedx = ballspeedx * -1;
                ballspeedy--;
            }
            if (( bally >= leftpaddley + 100) &&  (bally < leftpaddley + 150)) {
                ballspeedx = ballspeedx * -1;
                ballspeedy++;
            }
        }

        if (bally <= 20) {
            ballspeedy = ballspeedy * -1;
        }
        if (bally >= 980) {
            ballspeedy = ballspeedy * -1;
        }

        if (ballx <= 0) {
            ballx = 500;
            bally = 500;
            ballspeedx = -1;
            ballspeedy = 0;
            rightscore++;

        }
        if (ballx >= 1000) {
            ballx = 500;
            bally = 500;
            ballspeedx = 1;
            ballspeedy = 0;
            leftscore++;
        }
        if ((ballx >= 475) && (ballx <= 525)){
            if ((ballspeedx != 1) && (ballspeedx != -1)) {
                Random rand = new Random();
                int random = rand.nextInt(5);
                if (random == 2) {
                    ballspeedy--;
                }
                if (random == 3) {
                    ballspeedy++;
                }
            }

        }

        if ((upPressed == true) && ( 0 < leftpaddley)) {
            leftpaddley = leftpaddley - 20;
        }
        if ((downPressed == true) && (leftpaddley < 830)){
            leftpaddley = leftpaddley + 20;
        }
        if ((up2Pressed == true) && (0 < rightpaddley)) {
            rightpaddley = rightpaddley - 20;
        }
        if ((down2Pressed == true)&& (rightpaddley < 830)) {
            rightpaddley = rightpaddley + 20;
        }
        if (player == true) {
            if (bally <= leftpaddley + 25) {
                leftpaddley = leftpaddley -5;
            }
            if (bally >= leftpaddley + 25) {
                leftpaddley = leftpaddley +5;
            }

        }
        if (bots == true) {
            if (bally <= leftpaddley + 25) {
                leftpaddley = leftpaddley -15;
            }
            if (bally >= leftpaddley + 25) {
                leftpaddley = leftpaddley +15;
            }
            if (bally <= rightpaddley + 25) {
                rightpaddley = rightpaddley - 15;
            }
            if (bally >= rightpaddley + 25) {
                rightpaddley = rightpaddley +15;
            }

        }

        repaint();
    }

    public void keyReleased(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_S) {
            downPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_W) {
            upPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            up2Pressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            down2Pressed = false;
        }

    }

    public void keyPressed(KeyEvent e) {
        if (players == true) {
            if (e.getKeyCode() == KeyEvent.VK_S) {
                downPressed = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_W) {
                upPressed = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                up2Pressed = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                down2Pressed = true;
            }
        }

        if (player == true) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                up2Pressed = true;
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                down2Pressed = true;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_1) {
            player = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_2) {
            players = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_0) {
            bots = true;
        }
    }

    public void keyTyped(KeyEvent e) {

    }
}