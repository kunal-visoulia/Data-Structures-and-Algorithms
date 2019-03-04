public class StackLinkedList<Item> {
    private class Node<Item>{
        Item item;
        Node<Item> next;
    }
    
    private Node<Item> first;
    private int stack_size = 0;
    StackLinkedList(){
        first=null;
    }
    private int size() {
        System.out.println(stack_size);
        return stack_size;
    }
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
     Node<Item> temp = new Node<Item>();
     temp.item = x;
     temp.next = first;//make it point where the first was pointing
     
     first = temp;
     stack_size+=1;
    }

    private void pop(){
        if(first==null){
            System.out.println("Underflow");
            return;
        }
        Item val = first.item;
        System.out.println("Value popped = "+val);
        first=first.next;
        stack_size-=1;
    }

    private void peek(){
        if(first==null)
        System.out.println("Underflow");
        else
        System.out.println("Item at top is "+first.item);
    }
    

     public static void main(String[] args) {
        StackLinkedList<Integer> obj = new StackLinkedList<>();
        obj.pop();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.size();
        obj.traverse();
        obj.peek();
        obj.pop();
        obj.pop();
        obj.traverse();
        obj.peek();

        StackLinkedList<String> obj2 = new StackLinkedList<>();
        obj2.push("AA");
        obj2.push("BB");
        obj2.push("cc");
        obj2.push("DD");
        obj2.push("EE");
        obj2.traverse();
        obj2.peek();
        obj2.pop();
        obj2.pop();
        obj2.traverse();
        obj2.peek();

    }
}