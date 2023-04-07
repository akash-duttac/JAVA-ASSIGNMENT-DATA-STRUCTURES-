import java.util.Scanner;
class Node{
    int data;
    Node left, right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
class BinaryTree{
    Node root;
    BinaryTree(){ this.root = null; }
    void addNode(int data){
        Node newNode = new Node(data);
        if (root == null)
            root = newNode;
        else{
            Node current = root;
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
    void inorder(Node node){
        if (node != null){
            inorder(node.left);
            System.out.printf("%d  ", node.data);
            inorder(node.right);
        }
    }
    void preorder(Node node){
        if (node != null){
            System.out.printf("%d  ", node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }
    void postorder(Node node){
        if (node != null){
            postorder(node.left);
            postorder(node.right);
            System.out.printf("%d  ", node.data);
        }
    }
}
public class bst {
    public static void main (String[] args){
        Scanner get = new Scanner(System.in);
        BinaryTree tree = new BinaryTree();
        char choice;
        do{
            System.out.print("Enter data: ");
            int data = get.nextInt();
            tree.addNode(data);
            System.out.print("Add another node? (Y/N): ");
            choice = get.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.print("Inorder traversal: ");
        tree.inorder(tree.root);
        System.out.print("Preorder traversal: ");
        tree.preorder(tree.root);
        System.out.print("Postorder traversal: ");
        tree.postorder(tree.root);
    }
}
