package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(1);

        linkedList.prepend(2);
        linkedList.prepend(3);
        linkedList.prepend(3);
        linkedList.prepend(4);
        linkedList.prepend(4);
        linkedList.prepend(5);
        linkedList.prepend(6);
        linkedList.prepend(6);
        linkedList.reverse();
        linkedList.printList();
        linkedList.removeDuplicate();
        linkedList.printList();

        LinkedList.Node node = linkedList.removeFirst();


    }
}




