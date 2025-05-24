package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(2);

        linkedList.addToEnd(3);
        linkedList.addToEnd(4);
        linkedList.addToEnd(5);
        linkedList.addToEnd(6);
        linkedList.addToEnd(7);

        linkedList.printList();

        linkedList.get(4);
    }
}
