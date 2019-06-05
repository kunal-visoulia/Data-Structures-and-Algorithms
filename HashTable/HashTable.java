import java.util.ArrayList;
@SuppressWarnings("unchecked")

class HashNode<K, V> {
    K key;
    V value;
    HashNode<K, V> next;

    public HashNode(K key, V val) {
        this.key = key;
        this.value = val;
        this.next = null;
    }

}

public class HashTable<K,V> {
    ArrayList<HashNode<K, V>> bucketList; // hashtable as arraylist
    int size;// current size of hashtable
    int numBuckets;// current capacity of arraylist

    HashTable() {
        bucketList = new ArrayList<>();
        size = 0;
        numBuckets = 10;// 0-9 indexes in arraylist
        for (int i = 0; i < numBuckets; i++) {
            bucketList.add(null);
        }
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    int getBucketIndex(K key) {
        int hashcode = key.hashCode();
        int index = hashcode % numBuckets;
        return index;
    }

    public V remove(K key) {
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucketList.get(index);
        HashNode<K, V> prev = null;
        while (head != null) {
            if (head.key.equals(key))
                break;

            prev = head;
            head = head.next;

        }
        if (head == null)
            return null;

        if (prev != null)
            prev.next = head.next;
        else
            bucketList.set(index, head.next);
        // head element was the element at the index so prev =null
        size--;
        return head.value;
    }

    void add(K key, V value) {
        int index = getBucketIndex(key);
        HashNode<K, V> head = bucketList.get(index);
        while (head != null) {
            if (head.key.equals(key)) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = bucketList.get(index);// add at first position in bucket list at that index else where to add newNode?
        HashNode<K, V> newNode = new HashNode(key, value);
        newNode.next = head;// make it point to the head element(or null if head=null);becomes the first
                            // element
        bucketList.set(index, newNode);

        // If load factor goes beyond threshold, then
        // double the hash table size
        float lf = (float) size / numBuckets;
        if (lf >= 0.7) {
            ArrayList<HashNode<K, V>> temp = bucketList;
            bucketList = new ArrayList<>();
            numBuckets = 2 * numBuckets;
            for (int i = 0; i < numBuckets; i++) {
                bucketList.add(null);
            }
            for (HashNode<K, V> headNode : temp) {
                while (headNode != null) {
                    // intelligent
                    add(headNode.key,headNode.value);
                    headNode=headNode.next;
                }
            }
        }

    }

    public V get(K key){
        int bucketIndex = getBucketIndex(key); 
        HashNode<K, V> head = bucketList.get(bucketIndex); 
  
        // Search key in chain 
        while (head != null) 
        { 
            if (head.key.equals(key)) 
                return head.value; 
            head = head.next; 
        } 
  
        // If key not found 
        return null; 
    }

    public static void main(String[] args) {
        HashTable<String, Integer>map = new HashTable<>(); 
        map.add("this",1 ); 
        map.add("coder",2 ); 
        map.add("this",4 ); 
        map.add("hi",5 ); 
        System.out.println(map.size()); 
        System.out.println(map.remove("this")); 
        System.out.println(map.remove("this")); 
        System.out.println(map.size()); 
        System.out.println(map.isEmpty()); 
    }
}