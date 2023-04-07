import java.util.Scanner;
class node{
    int data;
    node left, right;
    node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class binaryTree {
    node root;
    binaryTree() {
        this.root = null;
    }
    void addNode(int data) {
        node newNode = new node(data);
        if (root == null)
            root = newNode;
        else {
            node current = root;
            while (true) {
                if (data < current.data) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    }
                } else {
                    if (current.right == null) {
                        current.right = newNode;
                        break;
                    }
                    current = current.right;
                }
            }
        }
    }
    boolean search(int data){
        node current = root;
        while (current != null){
            if (data == current.data)
                return true;
            else if (data < current.data)
                current = current.left;
            else
                current = current.right;
        }
        return false;
    }
}
public class bstsearch {
    public static void main(String[] args) {
        Scanner get = new Scanner(System.in);
        binaryTree tree = new binaryTree();
        char choice;
        do {
            System.out.print("Enter data: ");
            int data = get.nextInt();
            tree.addNode(data);
            System.out.print("Add another node? (Y/N): ");
            choice = get.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.print("Enter element to search for?: ");
        int data = get.nextInt();
        if (tree.search(data))
            System.out.println(data + "found");
        else
            System.out.println(data + "not found");
    }
}
