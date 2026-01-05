//26. Write a Java program to implement keyboard event listener. 

import java.awt.event.*;
import javax.swing.*;

public class Listener extends JFrame implements KeyListener {

    private JTextArea textArea;

    public Listener() {
        // Set up the frame
        setTitle("Keyboard Event Listener Example");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a text area and add key listener
        textArea = new JTextArea();
        textArea.addKeyListener(this);

        // Add text area to the frame
        add(textArea);
        setVisible(true);
    }

    // KeyListener methods
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("Key Pressed: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("Key Released: " + KeyEvent.getKeyText(e.getKeyCode()));
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("Key Typed: " + e.getKeyChar());
    }

    // Main method
    public static void main(String[] args) {
        new Listener();
    }
}

