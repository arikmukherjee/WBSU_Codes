//24. Write a Java program to demonstrate URL.

import java.net.URL;

public class Demourl {
    public static void main(String[] args) {
        try {
            // Create a URL object
            URL url = new URL("https://en.wikipedia.org/wiki/URL");

            // Display different components of the URL
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
            System.out.println("Port: " + url.getPort());
            System.out.println("Path: " + url.getPath());
            System.out.println("Query: " + url.getQuery());
            System.out.println("Ref (Anchor): " + url.getRef());
            System.out.println("File: " + url.getFile());
        } catch (Exception e) {
            System.out.println("Malformed URL: " + e.getMessage());
        }
    }
}
