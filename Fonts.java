//38. Write a Java program to display the fonts of a text.

import java.awt.*;
import javax.swing.*;

public class Fonts extends JFrame {

    public Fonts() {
        setTitle("Different Fonts");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setVisible(true);
    }

    // Override paint method to draw text with different fonts
    @Override
    public void paint(Graphics g) {
        super.paint(g);

        // Set background manually (optional)
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, getWidth(), getHeight());

        // Draw text using various fonts
        g.setColor(Color.BLACK);
        g.setFont(new Font("Serif", Font.PLAIN, 20));
        g.drawString("Serif Plain", 50, 100);

        g.setFont(new Font("SansSerif", Font.BOLD, 20));
        g.drawString("SansSerif Bold", 50, 140);

        g.setFont(new Font("Monospaced", Font.ITALIC, 20));
        g.drawString("Monospaced Italic", 50, 180);

        g.setFont(new Font("Dialog", Font.BOLD + Font.ITALIC, 20));
        g.drawString("Dialog Bold Italic", 50, 220);

        g.setFont(new Font("DialogInput", Font.PLAIN, 20));
        g.drawString("DialogInput Plain", 50, 260);
    }

    public static void main(String[] args) {
        new Fonts();
    }
}
