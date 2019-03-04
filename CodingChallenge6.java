/*
Challenge: 6

Write code to remove duplicates from an unsorted linked list.

Follow Up: How would you solve this problem if a temporary buffer is not allowed?

Complexity to achieve
Time Complexity: O(n)
Space Complexity: O(n)

=======================
Solution: USE HASHING!!!
We traverse the link list from head to end. For every newly 
encountered element, we check whether it is in the hash 
table: if yes, we remove it; otherwise we put it in the 
hash table.
*/

import java.util.HashSet;
import java.util.LinkedList;

public class CodingChallenge6<Item>{
    private class Node<Item>{
        Item item;
        Node<Item> next;
    }
    
    private Node<Item> first;

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
    }
    private void removeDuplicate(){
        HashSet<Item> hs = new HashSet<>();
        Node<Item> current = first;
        Node<Item> prev = null;
        while(current!=null){
            Item val = current.item;
            if(hs.contains(val))
                prev.next = current.next;
            else{
                hs.add(current.item);
                prev=current;
            }
            current = current.next;
        }

    }
    public static void main(String[] args) {
        CodingChallenge6<Integer> obj = new CodingChallenge6<>();
        obj.push(2);
        obj.push(1);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(5);
        obj.push(4);
        obj.traverse();
        obj.removeDuplicate();
        obj.traverse();



        CodingChallenge6<String> obj2 = new CodingChallenge6<>();
        obj2.push("AA");
        obj2.push("EE");
        obj2.push("BB");
        obj2.push("cc");
        obj2.push("DD");
        obj2.push("EE");
        obj2.push("cc");
        obj2.traverse();
        obj2.removeDuplicate();
        obj2.traverse();


    }
}
