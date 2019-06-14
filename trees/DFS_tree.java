import java.util.*;

public class DFS_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    private void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.data + "->");
            inorder(node.right);
        }
    }


    private void preorder(Node node) {
        if (node != null) {
            System.out.print(node.data + "->");
            preorder(node.left);
            preorder(node.right);
        }
    }

  

    private void postorder(Node node) {
        if (node != null) {
            postorder(node.left);
            postorder(node.right);
            System.out.print(node.data + "->");

        }
    }


    public static void main(String[] args) {
        DFS_tree bst = new DFS_tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("inorder:");
        bst.inorder(root);
        System.out.println("\npreorder:");
        bst.preorder(root);
        System.out.println("\npostorder:");
        bst.postorder(root);

    }

}