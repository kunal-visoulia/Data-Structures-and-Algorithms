A linked list is a linear data structure, in which the elements are not stored at contiguous memory locations.

#### Why do we need a linked list?
1. Dynamic data structure
2. You can add or remove elements as you wish
3. Insertion and Deletion takes constant time **O(1)**
4. With arrays you might need to shift elements: this takes O(n) time
5. If you don’t know how many items will be on the list
6. With arrays, you might need to re-declare and copy to new array if list grows too big
7. If you don’t need random access to any element
8. When you need to insert elements in the middle of the list

#### Disadvantages
1. Really bad for searching elements(**O(n)**). Does not allow direct access, so you have to iterate through the list until you find the element you’re searching for.
2. Takes extra memory space because you have to store a pointer to every element.












