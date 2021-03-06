public class ReverseLLIterativesive<Item>{
    private class Node<Item>{
        Item item;
        Node<Item> next;
    }
    
    private Node<Item> first = null;

    private void traverse(){
        Node<Item> temp;
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

    private void push(Item x){
        if(first==null){
            Node<Item> temp = new Node<Item>();
            temp.item = x;
            temp.next = null;
            first=temp;
    
        }
     else{
         Node<Item> temp = new Node<Item>();
     temp.item = x;
     temp.next = null;//make it point where the first was pointing
     Node<Item> temp2 = first;
     while(temp2.next!=null){
         temp2=temp2.next;
     } 
     temp2.next=temp;
    }}
    private void reverse(){
        reversell();
    }
    private void reversell(){
        Node<Item> prev,curr,nxt;
        nxt=curr=prev=first;
        curr=first.next;
        
        prev.next=null;


    }

    public static void main(String[] args) {
        ReverseLLIterativesive<Integer> obj = new ReverseLLIterativesive<>();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.traverse();
        obj.reverse();
        obj.traverse();

        // ReverseLLIterativesive<String> obj2 = new ReverseLLIterativesive<>();
        // obj2.push("AA");
        // obj2.push("EE");
        // obj2.push("BB");
        // obj2.push("cc");
        // obj2.push("DD");
        // obj2.push("EE");
        // obj2.push("cc");
        // obj2.traverse();


    }
}
