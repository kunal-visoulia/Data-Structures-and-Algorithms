import java.util.LinkedList;

public class JavaInbuiltLinkedList{

    public static void main(String[] args){
        LinkedList<String> obj = new LinkedList<>();
        obj.add("BB");
        obj.add("CC");
        obj.addLast("DD");
        obj.addFirst("AA");
        System.out.println("Linked list : " + obj); 
        obj.add(2,"E");
        System.out.println("Linked list : " + obj); 
        obj.remove("E");
        System.out.println("Linked list : " + obj); 
        obj.removeFirst();
        System.out.println("Linked list : " + obj); 
        obj.removeLast();
        System.out.println("Linked list : " + obj); 
        
        boolean status = obj.contains("E"); 
        if(status) 
            System.out.println("List contains the element 'E' "); 
        else
            System.out.println("List doesn't contain the element 'E'"); 
  
        int size = obj.size(); 
        System.out.println("Size of linked list = " + size); 

        Object element = obj.get(1);
        System.out.println("Element returned by get() : " + element);

        obj.set(1,"Z");
        System.out.println("Linked list after change : " + obj); 

    }
}
