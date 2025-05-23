package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(4);

        linkedList.getHead();
        linkedList.getTail();
        linkedList.getLength();
        linkedList.addToEnd(5);
        linkedList.addToEnd(6);
        linkedList.addToEnd(7);
        linkedList.addToEnd(8);

        linkedList.printList();
        linkedList.removeFromEnd();
        linkedList.printList();


    }
}
