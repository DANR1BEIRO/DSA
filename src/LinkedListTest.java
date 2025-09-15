import com.sun.security.jgss.GSSUtil;

public class LinkedListTest {
    Node head;
    Node tail;
    int length;

    public static class Node {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    public LinkedListTest(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printTest() {
        if (length == 0) {
            System.out.println("The list is empty");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.value);
            if (current.next != null) {
                System.out.print(" -> ");
            } else {
                System.out.println(".");
            }
            current = current.next;
        }
    }

    public void append(int value) {
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

    public Node removeLast() {
        if (length == 0) return null;

        Node current = head;
        Node previous = head;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }
        tail = previous;
        tail.next = null;
        length--;

        if (length == 0) {
            head = null;
            tail = null;
        }
        return current;
    }

    public void prepend(int value) {
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

    public Node removeFirst() {
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
        if (index < 0 || index >= length) return null;

        Node getNode = head;
        for (int i = 0; i < index; i++) {
            getNode = getNode.next;
        }
        return getNode;
    }

    public boolean set(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            return true;
        }
        return false;
    }

    public void setVoid(int index, int value) {
        Node temp = get(index);

        if (temp != null) {
            temp.value = value;
            System.out.println("The value at index " + index + " was set to: " + value);
            return;
        }
        throw new IndexOutOfBoundsException("Index: " + index + ", Length: " + length);
    }

    public boolean insert(int index, int value) {
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }

        Node previous = get(index - 1);
        Node newNode = new Node(value);

        newNode.next = previous.next;
        previous.next = newNode;
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node previousNode = get(index - 1);
        Node temp = previousNode.next;

        previousNode.next = temp.next;
        temp.next = null;
        length--;
        return temp;
    }

    public void reverse() {
        if (length < 2) {
            if (length == 0) {
                System.out.println("The list is empty");
            }
            return;
        }

        Node previous = null;
        Node current = head;
        Node after;
        head = tail;
        tail = current;

        while (current != null) {
            after = current.next;
            current.next = previous; // it now points backwards
            previous = current;
            current = after;
        }
    }

    public Node findMiddle() { // using the Tortoise and Hare algorithm
        if (length == 0) return null;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public boolean hasLoop() {
        if (head == null) return false;

        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;

    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }
}