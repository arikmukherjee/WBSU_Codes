//17. Write a program in Java to count the vowels of a 2-to-3-line text.

import java.util.Scanner;

public class Vowelline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder text = new StringBuilder();
        int lines = 3;  // You can change to 2 or 3 as needed

        System.out.println("Enter " + lines + " lines of text:");

        for (int i = 0; i < lines; i++) {
            text.append(sc.nextLine()).append(" ");
        }

        int vowelCount = 0;
        String input = text.toString().toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("Total number of vowels: " + vowelCount);
    }
}
