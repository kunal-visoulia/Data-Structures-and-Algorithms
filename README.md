# Design-and-Analysis-of-Algorithms

https://cooervo.github.io/Algorithms-DataStructures-BigONotation/index.html

## Arrays v/s ArrayLists
1. An array is basic functionality provided by Java. ArrayList is part of collection framework in Java. Therefore array members are accessed using [], while ArrayList has a set of methods to access elements and modify them. 
2. Array can contain both primitive data types as well as objects of a class depending on the definition of the array. However, ArrayList only supports object entries, not the primitive data types.
3. ArrayList has O(n) time complexity for arbitrary indices of add/remove, but O(1) for the operation at the end of the list.
LinkedList has O(n) time complexity for arbitrary indices of add/remove, but O(1) for operations at end/beginning of the List.

## Searching Algorithms
### Binary Search
- Data structure	            : Array
- Worst-case performance	    : O(log n)
- Best-case performance	        : O(1)
- Average performance	        : O(log n)
- Worst-case space complexity	: O(1)

## Sorting Algorithms
## Merge Sort
- Best, Avg, Wrost => O(nLogn) {O(n<sup>2</sup>Logn) for inplace implementation}
- Auxiliary Space     : O(n)
- Algorithmic Paradigm: Divide and Conquer
- Sorting In Place    : No for standard implementation
- Stable              : Yes

Despite of better worst case performance of merge sort, **quicksort is considered better than mergesort**. There are certain reasons due to which **quicksort is better especially in case of arrays**:
1. **Auxiliary Space** : Mergesort uses extra space, quicksort requires little space and exhibits good cache locality. Quick sort is an in-place sorting algorithm.
2. **Worst Cases** : The worst case of quicksort O(n<sup>2</sup>) can be avoided by using randomized quicksort. It can be easily avoided with high probability by choosing the right pivot. Obtaining an average case behavior by choosing right pivot element makes it improvise the performance and becoming as efficient as Merge sort.
3. **Merge sort is better for large data structures**: Mergesort is a *stable sort, unlike quicksort*, and can be easily adapted to operate on linked lists and very large lists stored on slow-to-access media such as disk storage or network attached storage. 
4. **Merge sort can work well on any type of data sets irrespective of its size (either large or small) whereas The quick sort cannot work well with large datasets.**
5. **Merge sort is more efficient and works faster than quick sort in case of larger array size or datasets whereas Quick sort is more efficient and works faster than merge sort in case of smaller array size or datasets.**
6. **The quick sort is internal sorting method where the data is sorted in main memory whereas The merge sort is external sorting method in which the data that is to be sorted cannot be accommodated in the memory and needed auxiliary memory for sorting.**

## Quick Sort

## Bubble Sort(Optimized)
- Worst and Average Case Time Complexity : O(n<sup>2</sup>). Worst case occurs when array is reverse sorted.
- Best Case Time Complexity              : O(n). Best case occurs when array is already sorted.
- Auxiliary Space                        : O(1)
- Sorting In Place                       : Yes
- Stable                                 : Yes

**Simple, Inefficient, Never used.**

## Insertion Sort
- Time Complexity      : O(n<sup>2</sup>)
- Best Time Complexity : O(n) for boundary case(already sorted array)
- Auxiliary Space      : O(1)
- Boundary Cases       : Insertion sort takes maximum time to sort if elements are sorted in reverse order. And it takes minimum time when elements are already sorted.
- Sorting In Place     : Yes
- Stable               : Yes

**Insertion sort is generally the fastest solution for sorting small lists (10 or fewer elements), and performs at least adequately in medium-sized lists. It can become prohibitively slow in larger sets.<br> However, Insertion sort also performs well, even in large sets, if the list is already mostly sorted. This makes it ideal for cleaning up legacy human-sorted data, or for using in conjunction with other sorting algorithms. For example, it is common to begin with a quick sort, and then switch to insertion sort after a few iterations.**

## Selection Sort
- Time Complexity: O(n<sup>2</sup>) as there are two nested loops.
- Auxiliary Space: O(1)
- Stability : The default implementation is not stable. However it can be made stable. 
- In Place : Yes, it does not require extra space.

**Usually, insertion sort will perform less comparisons than selection sort, depending on the degree of "sortedness" of the array. While selection sort must scan the remaining parts of the array when placing an element, insertion sort only scans as many elements as necessary. That means that when the array is already sorted or almost sorted, insertion sort performs in O(n) time.<br>One advantage of selection sort over insertion sort, is that the number of writes (swaps) is in O(n), while in insertion sort it is in O(n^2).**

## What are BFS and DFS for Binary Tree?
A Tree is typically traversed in two ways:
1. Breadth First Traversal (Or Level Order Traversal)
2. Depth First Traversals
    - Inorder Traversal (Left-Root-Right)
    - Preorder Traversal (Root-Left-Right)
    - Postorder Traversal (Left-Right-Root)





