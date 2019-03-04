
public class StackLinkedList{
    private class Node{
        int item;
        Node next;
    }
    
    private Node first;

    StackLinkedList(){
        first=null;
    }

    private void traverse(){
        Node temp;
        temp=first;
        if (temp==null){
            System.out.println("Underflow");
        }
        else
        {while(temp!=null){
            System.out.print("->"+temp.item);
            temp=temp.next;
        }
    }
    System.out.println(" ");
    }

    private void push(int x){
     Node temp = new Node();
     temp.item = x;
     temp.next = first;//make it point where the first was pointing
     
     first = temp;
    }

    private void pop(){
        if(first==null)
            System.out.println("Underflow");
        int val = first.item;
        System.out.println("Value popped = "+val);
        first=first.next;

    }

    private void peek(){
        if(first==null)
        System.out.println("Underflow");
        else
        System.out.println("Item at top is "+first.item);
    }
    

     public static void main(String[] args) {
        StackLinkedList obj = new StackLinkedList();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.traverse();
        obj.peek();
        obj.pop();
        obj.pop();
        obj.traverse();
        obj.peek();
    }
}