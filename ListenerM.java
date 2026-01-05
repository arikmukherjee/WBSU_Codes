//Write a Java program to implement mouse event listener (click, enter, exited, pressed, release)
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ListenerM extends JFrame implements MouseListener {

    private JLabel statusLabel;

    public ListenerM() {
        // Set up the frame
        setTitle("Mouse Event Listener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create a panel that listens to mouse events
        JPanel panel = new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.addMouseListener(this);  // Register this class as the mouse listener

        // Status label to show mouse events
        statusLabel = new JLabel("Perform a mouse action...");
        statusLabel.setHorizontalAlignment(SwingConstants.CENTER);

        // Add components to frame
        add(panel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);

        setVisible(true);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        statusLabel.setText("Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        statusLabel.setText("Mouse Entered the panel");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        statusLabel.setText("Mouse Exited the panel");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        statusLabel.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        statusLabel.setText("Mouse Released");
    }

    // Main method
    public static void main(String[] args) {
        new ListenerM();
    }
}