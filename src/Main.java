public class Main {
    public static void main(String[] args) {

        LinkedListTest ll = new LinkedListTest(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);
        ll.printTest();
        ll.reverse();
        ll.printTest();
        ll.insert(1, 80);
        ll.printTest();
        ll.remove(1);
        ll.printTest();
        System.out.println(ll.findMiddle().value);


    }
}
