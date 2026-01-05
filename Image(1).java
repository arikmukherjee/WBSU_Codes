//48. Write a Java program to display an image.

import javax.swing.*;

public class Image extends JFrame{

    public Image()
    {
        setTitle("Show Image");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setVisible(true); // Make the frame visibl

        ImageIcon img=new ImageIcon("C:\\Users\\Sampurna\\OneDrive\\Desktop\\java2nd\\2ndsemjava\\src\\practice.jpg");

        JLabel imageLabel = new JLabel(img);
        imageLabel.setHorizontalAlignment(JLabel.CENTER);
        imageLabel.setVerticalAlignment(JLabel.CENTER);

        // Add the label to the frame
        add(imageLabel);

    }
    public static void main(String[] args)
    {
         new Image();
    }
    
}
