import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class BallPanel extends JPanel implements Runnable {
    int x = 50, y = 50;
    int dx = 2, dy = 2;
    boolean running = false;

    public BallPanel() {
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (!running) {
                    running = true;
                    Thread t = new Thread(BallPanel.this);
                    t.start();
                }
            }
        });
    }

    public void run() {
        while (running) {
            x += dx;
            y += dy;

            // Bounce logic
            if (x <= 0 || x >= getWidth() - 30)
                dx = -dx;

            if (y <= 0 || y >= getHeight() - 30)
                dy = -dy;

            repaint();

            try {
                Thread.sleep(10);
            } catch (Exception e) {}
        }
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, 30, 30);
    }
}

public class BouncingBall {
    public static void main(String[] args) {
        JFrame f = new JFrame("Bouncing Ball");
        BallPanel panel = new BallPanel();

        f.add(panel);
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}