//40. Write a Java program to demonstrate labels.

import java.awt.*;
import javax.swing.*;

public class Labels extends JFrame {

    public Labels() {
        setTitle("JLabel Example");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());  // Simple layout for placing labels

        // Create labels
        JLabel label1 = new JLabel("This is a simple text label.");
        JLabel label2 = new JLabel("Label with Image and Text");
        
        // Load an icon (optional - make sure the image file is present)
        ImageIcon img = new ImageIcon("C:\\Users\\Sampurna\\OneDrive\\Desktop\\java2nd\\2ndsemjava\\src\\practice.jpg"); // Replace with your image file
        JLabel label3 = new JLabel("Flower", img, JLabel.CENTER);
        //label3.setHorizontalAlignment( JLabel.CENTER);
        //label3.setVerticalAlignment( JLabel.CENTER);

        // Customize label
        label1.setFont(new Font("Arial", Font.BOLD, 14));
        label2.setForeground(Color.BLUE);
        label3.setFont(new Font("SansSerif", Font.ITALIC, 12));

        // Add labels to the frame
        add(label1);
        //System.out.println("\n");
        add(label2);
        //System.out.println("\n");
        add(label3);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Labels();
    }
}
