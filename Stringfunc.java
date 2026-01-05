//21. Write a Java program to implement any five function of String.

import java.util.Scanner;

public class Stringfunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // 1. length() - returns the number of characters
        System.out.println("Length of string: " + str.length());

        // 2. toUpperCase() - converts all characters to uppercase
        System.out.println("Uppercase: " + str.toUpperCase());

        // 3. toLowerCase() - converts all characters to lowercase
        System.out.println("Lowercase: " + str.toLowerCase());

        // 4. charAt(index) - returns character at specified index
        System.out.print("Enter index to get character: ");
        int index = sc.nextInt();
        if (index >= 0 && index < str.length()) {
            System.out.println("Character at index " + index + ": " + str.charAt(index));
        } else {
            System.out.println("Invalid index.");
        }

        sc.nextLine(); // Consume newline

        // 5. contains() - checks if a string contains another substring
        System.out.print("Enter substring to search for: ");
        String sub = sc.nextLine();
        if (str.contains(sub)) {
            System.out.println("The string contains \"" + sub + "\".");
        } else {
            System.out.println("The string does not contain \"" + sub + "\".");
        }
    }
}


