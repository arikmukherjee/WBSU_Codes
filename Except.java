// 11. Write a program in Java to create your own exception.
class Excep extends Exception {
    Excep(String x) {
        super(x); // Set the exception message
    }
}

public class Except {
    public static void main(String[] args) {
        int[] age = {17, 18, 20, 17};
        String[] name = {"Sam", "Arjo", "Seeza", "Sayani"};

        for (int i = 0; i < age.length; i++) {
            try {
                if (age[i] < 18) {
                    throw new Excep(name[i] + " can't vote");
                } else {
                    System.out.println(name[i] + " can vote.");
                }
            } catch (Excep e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

