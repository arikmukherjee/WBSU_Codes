//22. Write a Java program to demonstrate InetAddress.

import java.net.*;

public class Inet {

    public static void main(String[] args) {
        try {
            // Get local host (your computer)
            InetAddress localHost = InetAddress.getLocalHost();
            System.out.println("Local Host Name: " + localHost.getHostName());
            System.out.println("Local IP Address: " + localHost.getHostAddress());

            // Get InetAddress for a known website
            InetAddress google = InetAddress.getByName("www.google.com");
            System.out.println("\nGoogle Host Name: " + google.getHostName());
            System.out.println("Google IP Address: " + google.getHostAddress());

            // Get all IP addresses associated with a domain
            InetAddress[] addresses = InetAddress.getAllByName("www.microsoft.com");
            System.out.println("\nMicrosoft IP Addresses:");
            for (InetAddress addr : addresses) {
                System.out.println(addr.getHostAddress());
            }

        } catch (UnknownHostException e) {
            System.out.println("Host not found: " + e.getMessage());
        }
    }
}
