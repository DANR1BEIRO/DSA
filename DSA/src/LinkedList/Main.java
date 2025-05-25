package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);

        linkedList.addToFront(2);
        linkedList.addToFront(3);
        linkedList.addToFront(4);
        linkedList.printList();

        linkedList.reverse();
        linkedList.printList();

    }
}




