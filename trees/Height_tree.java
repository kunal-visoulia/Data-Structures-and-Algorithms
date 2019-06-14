import java.util.*;

public class Height_tree {
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

    public int getHeight(Node root) {
        if (root == null)
            return 0;
        int lh=getHeight(root.left);
        int rh=getHeight(root.right);

        return 1+Math.max(lh,rh);
    }

    public static void main(String[] args) {
        Height_tree bst = new Height_tree();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        System.out.println("height of given tree is:" + bst.getHeight(root));

    }

}