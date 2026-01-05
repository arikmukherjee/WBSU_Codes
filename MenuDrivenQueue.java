import java.util.Scanner;

class Queue {
    int front, rear, size;
    int[] queue;

    Queue(int size) {
        this.size = size;
        front = rear = 0;
        queue = new int[size];
    }

    void enqueue(int item) {
        if (rear == size) {
            System.out.println("Queue is full");
        } else {
            queue[rear++] = item;
            System.out.println(item + " added to queue");
        }
    }

    void dequeue() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(queue[front] + " removed from queue");
            for (int i = 0; i < rear - 1; i++) {
                queue[i] = queue[i + 1];
            }
            rear--;
        }
    }

    void display() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i < rear; i++) {
                System.out.print(queue[i] + " ");
            }
            System.out.println();
        }
    }

    void peek() {
        if (front == rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.println("Front element: " + queue[front]);
        }
    }
}

public class MenuDrivenQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue(5);
        int choice;

        do {
            System.out.println("\n--- Queue Menu ---");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to enqueue: ");
                    int item = sc.nextInt();
                    q.enqueue(item);
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.display();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}
