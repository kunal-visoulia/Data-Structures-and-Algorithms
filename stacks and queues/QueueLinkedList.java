public class QueueLinkedList<Item> {
    private class Node<Item> {
        Item item;
        Node<Item> next;
    }

    Node<Item> front;
    Node<Item> rear;

    QueueLinkedList() {
        front = rear = null;
    }

    public void enqueue(Item val) {
        Node<Item> temp = new Node<>();
        temp.item = val;
        temp.next = null;
        if(front==null && rear ==null){
        rear = temp;
        front=temp;
        }
        else{
        rear.next=temp;
        rear = temp;
        }
    }

public void dequeue(){
    if(front==null){
        System.out.println("Underflow");
        return;
        }
        System.out.print("\n");
    System.out.println("item in front= "+front.item);
        front=front.next;
}

public void traverse(){
    Node<Item> ptr=front;
    System.out.println("traverse:");
    while(ptr!=null){
        System.out.print(ptr.item+"->");
        ptr=ptr.next;
    }
    System.out.println("");

}

    public static void main(String[] args) {
        QueueLinkedList<Integer> Q1 = new QueueLinkedList<>();
        Q1.enqueue(1);
        Q1.enqueue(2);
        Q1.traverse();
        Q1.dequeue();
        Q1.traverse();
        Q1.enqueue(3);
        Q1.traverse();
    }
}