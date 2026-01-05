//39. Write a Java program to display a text in a specific location on window.
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.*;

public class Showtext extends JPanel {

    // Store points where text will be drawn
    private final java.util.List<Point> clickPoints = new ArrayList<>();

    public Showtext() {
        // Mouse listener to detect clicks
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                clickPoints.add(e.getPoint());
                repaint(); // Redraw the panel
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setFont(new Font("Arial", Font.PLAIN, 14));
        g.setColor(Color.BLUE);

        for (Point p : clickPoints) {
            g.drawString("You clicked here", p.x, p.y);
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Click Text Printer");
        Showtext panel = new Showtext();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 400);
        frame.add(panel);
        frame.setVisible(true);
    }
}
