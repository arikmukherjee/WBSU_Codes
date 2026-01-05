//23. Write a Java program to demonstrate getPort().

import java.io.IOException;
import java.net.Socket;

public class Port {

    public static void main(String[] args) {
        String host = "example.com"; // or use "google.com", "localhost"
        int port = 80; // HTTP port

        try {
            // Create a socket to connect to the host and port
            Socket socket = new Socket(host, port);

            // Use getPort() to retrieve the port number connected to
            System.out.println("Connected to host: " + host);
            System.out.println("Port (getPort): " + socket.getPort());

            // Also show local port (your machine's side of the socket)
            System.out.println("Local Port (getLocalPort): " + socket.getLocalPort());

            socket.close(); // Always close the socket when done
        } catch (IOException e) {
            System.out.println("Connection failed: " + e.getMessage());
        }
    }
}

