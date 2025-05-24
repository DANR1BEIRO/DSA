package LinkedList;

import com.sun.security.jgss.GSSUtil;

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

    public void addToEnd(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node removeFromEnd() {
        if (length == 0) return null;
        Node temp = head;
        Node prev = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        tail = prev;
        tail.next = null;
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public void addToFront(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFromFront() {
        if (length == 0) return null;
        Node removedNode = head;
        if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
        }
        removedNode.next = null;
        length--;
        return removedNode;
    }

    public Node get(int index) {
        if (length < 0 || index > length) {
            System.out.println("Index out of bounds");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        System.out.println("The element at the index of " + index + " is: " + temp.value);
        return temp;
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

    class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }
}
