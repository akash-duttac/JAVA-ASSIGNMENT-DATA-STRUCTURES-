import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class queueactual {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        Queue<Integer> q = new LinkedList<>();
        int choice;
        do {
            System.out.println("***** MAIN MENU *****");
            System.out.println("1. Enqueue\t2. Dequeue");
            System.out.println("3. Display\t4. EXIT");
            System.out.print("Enter your choice: ");
            choice = get.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.print("Enter data: ");
                    int value = get.nextInt();
                    q.add(value);
                }
                case 2 -> {
                    if (!q.isEmpty())
                        System.out.println(q.remove() + " removed");
                }
                case 3 -> System.out.println("QUEUE: " + q);
            }
        } while (choice != 4);
    }
}
