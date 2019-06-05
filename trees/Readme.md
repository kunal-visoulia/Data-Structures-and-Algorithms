### Binary Tree –
In a binary tree, a node can have maximum two children.
1. Searching: For searching element 2, we have to traverse all elements (assuming we do breadth first traversal). Therefore, searching in binary tree has worst case complexity of **O(n)**.
2. Insertion: For inserting element as left child of 2, we have to traverse all elements. Therefore, insertion in binary tree has worst case complexity of **O(n)**.
3. Deletion: For deletion of element 2, we have to traverse all elements to find 2 (assuming we do breadth first traversal). Therefore, deletion in binary tree has worst case complexity of **O(n)**.

### Binary Search Tree (BST) –
BST is a special type of binary tree in which left child of a node has value less than the parent and right child has value greater than parent.
1. Searching: For searching element 1, we have to traverse all elements (in order 3, 2, 1). Therefore, searching in binary search tree has worst case complexity of **O(n)**. 
2. Insertion: For inserting element 0, it must be inserted as left child of 1. Therefore, we need to traverse all elements (in order 3, 2, 1) to insert 0 which has worst case complexity of **O(n)**. 
3. Deletion: For deletion of element 1, we have to traverse all elements to find 1 (in order 3, 2, 1). Therefore, deletion in binary tree has worst case complexity of **O(n)**.

**on Average, for all above cases it is O(log(n)) or O(h) where h is the height of the tree**

### AVL/ Height Balanced Tree –
AVL tree is binary search tree with additional property that difference between height of left sub-tree and right sub-tree of any node can’t be more than 1.

Average and worst complexities for S,I,D is O(log(n)).

### B-tree
B-Tree is a self-balancing search tree. In most of the other self-balancing search trees (like AVL and Red-Black Trees), it is assumed that everything is in main memory. To understand the use of B-Trees, we must think of the huge amount of data that cannot fit in main memory. When the number of keys is high, the data is read from disk in the form of blocks. Disk access time is very high compared to main memory access time. 
The main idea of using B-Trees is to reduce the number of disk accesses. Most of the tree operations (search, insert, delete, max, min, ..etc ) require O(h) disk accesses where h is the height of the tree.
B-tree is a fat tree. The height of B-Trees is kept low by putting maximum possible keys in a B-Tree node. Generally, a B-Tree node size is kept equal to the disk block size. Since h is low for B-Tree, total disk accesses for most of the operations are reduced significantly compared to balanced Binary Search Trees like AVL Tree, Red-Black Tree, ..etc.

Average and worst complexities for S,I,D is O(log(n)).

[Unbalanced BST to Balanced BST in O(n)](https://www.geeksforgeeks.org/convert-normal-bst-balanced-bst/)