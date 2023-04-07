import java.util.Scanner;
import java.util.Stack;
public class stackActual {
    public static void main(String[] args){
        Scanner get = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        int choice;
        do{
            System.out.println("***** MAIN MENU *****");
            System.out.println("1. Push\t2. Pop\n3. Display\t4. Is Empty?");
            System.out.print("5. Peek\t6. EXIT\nEnter your choice: ");
            choice = get.nextInt();
            switch (choice){
                case 1 -> {
                    System.out.print("Enter value: ");
                    int value = get.nextInt();
                    stk.push(value);
                }
                case 2 -> System.out.println(stk.pop() + " Popped");
                case 3 -> System.out.println("Stack : " + stk);
                case 4 -> System.out.println("Stack is empty?: " + stk.isEmpty());
                case 5 -> System.out.println("Top of stack value: " + stk.peek());
            }
        } while (choice != 6);
    }
}
