//39. Write a Java program to display a text in a specific location on window.

import java.awt.*;
import javax.swing.*;
public class Showtext extends  JFrame{

    public Showtext()
    {
        setTitle("Window");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true);
    }
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Call superclass method to ensure proper painting

        // Set font and color (optional)
        g.setFont(new Font("Arial", Font.BOLD, 20));
        g.setColor(Color.BLUE);

        // Draw text at (x=100, y=150)
        g.drawString("Java Program to show text at a specific location", 200, 150);
    }
    public static void main(String[] args) {
        new Showtext();
    }
}
