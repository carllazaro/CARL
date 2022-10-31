import java.util.Scanner;
public class Tree {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        /* Tree looks like this:
                 Node 1
                 /   \
            Node 2  Node 3
               / \
         Node 4   Node 5
        */
        System.out.print("Enter nodes values (separated by space): ");
        int node1input = s.nextInt(); 
        int node2input = s.nextInt(); 
        int node3input = s.nextInt(); 
        int node4input = s.nextInt(); 
        int node5input = s.nextInt();
        
        Node node2 = new Node(node1input);
        Node node3 = new Node(node2input);
        Node node4 = new Node(node3input);
        Node node5 = new Node(node4input);
        Node node6 = new Node(node5input);

        node2.left = node3;
        node2.right = node4;
        node3.left = node5;
        node3.right = node6;

        System.out.print("Sum of all values of this tree is: ");
        System.out.println(sumValues(node2));
    }

    static int sumValues(Node root) {
        if (root == null) {
            return 0;
        }
        return root.data + sumValues(root.left) + sumValues(root.right);
    }
}

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
    }
}
