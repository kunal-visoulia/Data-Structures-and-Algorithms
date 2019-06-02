public class BST{
    
    class Node{
        int data;
        Node left;
        Node right;

    Node(int data){
        this.data=data;
        left=null;
        right=null;
    }
        }
    private Node root;
    BST(){
        root=null;
    }
   private Node insert(Node node,int data){
        if(node==null){
            node=new Node(data);
        }
        else{
            if(data<=node.data)
                node.left=insert(node.left,data);
            
            else
            node.right=insert(node.right,data);
        }
        return node;
    }
    void insert(int data){
        root=insert(root,data);
    }

   private void inorder(Node node){
        if(node!=null){
            inorder(node.left);
            System.out.print(node.data+"->");
            inorder(node.right);
        }
    }
    void inorder(){
        inorder(root);
    }
public static void main(String[] args) {
    BST bst=new BST();
    bst.insert(1);
    bst.insert(3);
    bst.insert(2);
    bst.insert(4);
    bst.insert(5);
    bst.insert(22);
    bst.insert(6);
    bst.insert(10);
    bst.insert(9);
    bst.inorder();

}


}