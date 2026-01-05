import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Balls extends JPanel implements ActionListener {

    private int b1x = 100;
    private int b1y = 100;
    private int b1d = 40;
    private int b1dx = 2;
    private int b1dy = 3;

    private int b2x = 150;
    private int b2y = 150;
    private int b2d = 60;
    private int b2dx = 5;
    private int b2dy = 4;

    private final Timer timer;

    public Balls() {
        setBackground(Color.WHITE);
        timer = new Timer(10, this);  // Fires every 10 ms
        timer.start();                // Start the timer
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);           // Clear the panel
        g.setColor(Color.RED);             // Set the ball color
        g.fillOval(b1x, b1y, b1d, b1d); // Draw the ball
        g.setColor(Color.BLACK);
        g.fillOval(b2x, b2y, b2d, b2d);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Bounce off left/right walls
        if (b1x + b1dx < 0 || b1x + b1d + b1dx > getWidth()) {
            b1dx = -b1dx;
        }

        // Bounce off top/bottom walls
        if (b1y + b1dy < 0 || b1y + b1d + b1dy > getHeight()) {
            b1dy = -b1dy;
        }

        // Bounce off left/right walls 2nd ball
        if (b2x + b2dx < 0 || b2x + b2d + b2dx > getWidth()) {
            b2dx = -b2dx;
        }

        // Bounce off top/bottom walls 2nd ball
        if (b2y + b2dy < 0 || b2y + b2d + b2dy > getHeight()) {
            b2dy = -b2dy;
        }

        b1x += b1dx;  // Update x position
        b1y += b1dy;  // Update y position
        b2x += b2dx;  
        b2y += b2dy;
        repaint(); // Redraw the panel
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        Balls panel = new Balls();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}

