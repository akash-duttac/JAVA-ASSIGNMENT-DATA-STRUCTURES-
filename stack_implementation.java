import java.util.Scanner;
class Stack{
    int top=-1, size;
    int[] stack;
    Stack(int size){
        this.size = size;
        stack = new int[this.size];
    }
    boolean isFull(){ return top==size; }
    boolean isEmpty(){ return top==-1; }
    void push(int value){ stack[++top] = value; }
    int pop(){ return stack[top--]; }
    void print(){
        System.out.println("STACK: ");
        for (int i=top; i>=0; i--)
            System.out.println(stack[i]);
    }
}
public class stack_implementation {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        System.out.print("Enter size of stack: ");
        int size = get.nextInt();
        Stack s = new Stack(size);
        int choice;
        do {
            System.out.println("***** MAIN MENU *****");
            System.out.println("1. Push\t2. Pop\t3. Display\t4. EXIT");
            System.out.print("Enter your choice: ");
            choice = get.nextInt();
            switch (choice) {
                case 1 -> {
                    if (s.isFull())
                        System.out.println("STACK IS FULL");
                    else {
                        System.out.print("Enter value: ");
                        int value = get.nextInt();
                        s.push(value);
                    }
                }
                case 2 -> {
                    if(s.isEmpty())
                        System.out.println("STACK IS EMPTY");
                    else
                        System.out.println(s.pop() + " Popped");
                }
                case 3 -> s.print();
            }
        } while (choice != 4);
        System.out.println("END OF PROGRAM");
    }
}