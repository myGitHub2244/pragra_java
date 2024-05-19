A List can contain duplicates, but a Set can’t
A List will preserve the order of insertion i.e. elements gets added via add() in order, but a Set may or may not
Since insertion order may not be maintained in a Set, it doesn’t allow index-based access as in the List

ArrayList uses an array, which allows for fast random access but slow insertion and deletion.
While LinkedList uses a doubly linked list, which allows for fast insertion and deletion but slow random access.

Also one of the major difference lies in the access time. ArrayList provides O(1) time complexity for index-based access
but O(n) for insertions and removals within the list. In contrast, LinkedList offers O(1) time complexity for insertions and
removals but O(n) for index-based access, as it requires traversing the list.

How the ArrayList works
The ArrayList class has a regular array inside it. When an element is added, it is placed into the array.
If the array is not big enough, a new, larger array is created to replace the old one and the old one is removed.

How the LinkedList works
The LinkedList stores its items in "containers." The list has a link to the first container and each container has a link
to the next container in the list. To add an element to the list, the element is placed into a new container and that container
is linked to one of the other containers in the list.

