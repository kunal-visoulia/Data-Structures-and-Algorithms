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
    void deleteKey(int data) 
    { 
        root = deleteRec(root, data); 
    } 
  
    Node deleteRec(Node root, int data) 
    { 
        if(root==null) return root;
         if(data>root.data){
            root.right=deleteRec(root.right, data);
         }
         else if(data<root.data){
            root.right=deleteRec(root.left, data);
         }
         else{
        if(root.left==null)
            return root.right;
        else if(root.right==null)
            return root.left;
        root.data=minValue(root.right);// node with two children: Get the inorder successor (smallest 
        root.right=deleteRec(root.right, root.data);
    }
        return root; 
    } 
  
    int minValue(Node root) 
    { int minv=root.data;
        while(root.left!=null)
{
    minv=root.data;
    root=root.left;
}
        return minv;
    } 
   private Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        else{
            if(data<=root.data)
                root.left=insert(root.left,data);//passing the root of left subtree as argument and updating the the root of left subtree after succesfull insertion
            
            else
            root.right=insert(root.right,data);
        }
        return root;
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
    System.out.println("\n");
    bst.deleteKey(4);
    bst.inorder();

}


}