//41. Write a Java program to demonstrate buttons.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Button extends JFrame implements ActionListener {

    JButton btnClickMe,clickx,clicky, btnExit;
    JLabel label;

    public Button() {
        // Set up frame
        setTitle("Button Example");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Create components
        btnClickMe = new JButton("Click Me");
        clickx=new JButton("X");
        clicky=new JButton("Y");
        btnExit = new JButton("Exit");
        label = new JLabel("Press a button...");

        // Add action listeners
        btnClickMe.addActionListener(this);
        clickx.addActionListener(this);
        clicky.addActionListener(this);
        btnExit.addActionListener(this);

        // Add components to frame
        add(btnClickMe);
        add(clickx);
        add(clicky);
        add(btnExit);
        add(label);

        setVisible(true);
    }

    // Handle button clicks
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnClickMe) {
            label.setText("Button Clicked!");
        }
        else if(e.getSource()==clickx)
        {
            label.setText("Button X clicked");
        }
        else if(e.getSource()==clicky)
        {
            label.setText("Button Y clicked");
        }
         else if (e.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Button();
    }
}
