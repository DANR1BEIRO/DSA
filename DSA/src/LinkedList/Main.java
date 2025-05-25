package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(11);
        linkedList.addToEnd(3);
        linkedList.addToEnd(23);
        linkedList.addToEnd(7);
        linkedList.printList();
        linkedList.getLength();
        LinkedList.Node removed = linkedList.remove(2);
        linkedList.printList();
        linkedList.getLength();
        System.out.println("The removed node was " + removed.value);

    }
}




