package LinkedList;

public class LinkedList {

    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        System.out.println("Current list:");
        if (temp == null) {
            System.out.println("The list is empty.");
        }
        while (temp != null) {
            System.out.print(temp.value);
            if (temp.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.println(".");
            }
            temp = temp.next;
        }
    }

    public void append(int value) {        // Adds a new node with the given value to the end
        Node newNode = new Node(value);    // Creates a new node with the value
        if (length == 0) {                 // If the list is empty
            head = newNode;                // Sets both head and tail to the new node
            tail = newNode;
        } else {                           // If the list isn't empty
            tail.next = newNode;           // Links the newNode after the current tail
            tail = newNode;                // Updates tail to point to the new node
        }
        length++;                          // Increments the list length;
    }

    public Node removeLast() {
        if (length == 0) return null;      // Returns null if list is empty
        Node temp = head;                  // Starts traversal from head
        Node previous = head;              // Stores reference to previous node
        while (temp.next != null) {        // Traverses until last node
            previous = temp;               // Updates previous reference
            temp = temp.next;              // Moves to next node
        }
        tail = previous;                   // Updates tail to second-to-last node
        tail.next = null;                 // Breaks link to removed node
        length--;                         // Decrements length
        if (length == 0) {                // If list is now empty
            head = null;                  // Resets head
            tail = null;                  // Resets tail
        }
        return temp;                      // Returns the removed node
    }

    public void prepend(int value) {        // Adds new node with value at the start of list
        Node newNode = new Node(value);     // Creates new node with given value
        if (length == 0) {                  // If list is empty
            head = newNode;                 // Sets both head and tail to new node
            tail = newNode;
        } else {                            // If list not empty
            newNode.next = head;            // Links new node before current head
            head = newNode;                 // Updates head to point to new node
        }
        length++;                           // Increments list length
    }

    public Node removeFirst() {             // Removes and returns first node of list
        if (length == 0) return null;       // Returns null if list is empty
        Node removedNode = head;            // Stores reference to node being removed
        if (head.next == null) {            // If list has only one node
            head = null;                    // Resets head to null
            tail = null;                    // Resets tail to null
        } else {                            // If list has multiple nodes
            head = head.next;               // Moves head to next node
        }
        removedNode.next = null;            // Breaks link from removed node
        length--;                           // Decrements list length
        return removedNode;                 // Returns the removed node
    }

    public Node get(int index) {            // Returns node at specified index
        if (index < 0 || index >= length) { // Checks if index is out of bounds
            System.out.println("Index out of bounds");
            return null;                     // Returns null if invalid index
        }
        Node temp = head;                   // Starts traversal from head
        for (int i = 0; i < index; i++) {   // Loops until reaching desired index
            temp = temp.next;               // Moves to next node each iteration
        }
        return temp;                        // Returns node at requested index
    }

    public boolean set(int index, int value) {
        Node temp = get(index);                  // Retrieve the node at the specified index
        if (temp != null) {
            temp.value = value;                  // If the node is found, set the value of the node
            return true;                         // Return true to indicate that the value was set successfully
        }
        return false;                            // Return false if the index is out of bounds
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {                 // If the index is 0, insert at the beginning of the list
            prepend(value);               // using the method `prepend()`
            return true;
        }
        if (index == length) {           // If the index is at the end, insert at the end of the list
            append(value);               // usind the method `append()`
            return true;
        }
        Node newNode = new Node(value);  // If the index is in the middle, insert the Node
        Node temp = get(index - 1);      // Get a pointer to the node at the previous index, using get(index-1)
        newNode.next = temp.next;        // Insert the newNode by updating the next pointers
        temp.next = newNode;
        length++;                        // Update the length of the list
        return true;                     // Returns true to indicate successful insertion
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;    // check if the list os out of bounds
        if (index == 0) return removeFirst();             // If the index is 0, return the removeFirst() method
        if (index == length - 1)
            return removeLast();     // If the index is the last one, return the removeLast() method

        Node previous = get(index - 1);              // Get the previous node of the one to be removed
        Node current = previous.next;                // Get the node to be removed

        previous.next = current.next;                // Update the previous node's pointer to skip over the removed node
        current.next = null;                         // Detach the removed node(current) from the list
        length--;                                    // Decrease the length by 1
        return current;                              // Returns the removed node
    }

    public void reverse() {
        if (length < 2) {                    // No need to reverse if list has 0 or 1 elements
            if (length == 0) {
                System.out.println("Can't reverse an empty list");
            }
            return;
        }
        Node current = head;                 // Start from the head of the list
        head = tail;                         // Swap head and tail references
        tail = current;

        Node previous = null;                // Create a Node before the current Node as null
        Node next;                           // Temporary Node to hold next reference

        for (int i = 0; i < length; i++) {   // Perform a for loop through the entire list(length)
            next = current.next;             // Store next node before overwrite it
            current.next = previous;         // Reverse the current node's pointer
            previous = current;              // Move previous to current position
            current = next;                  // Move current to next position
        }
    }

    public void getHead() {
        System.out.println("Head: " + this.head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + this.tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + this.length);
    }

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
