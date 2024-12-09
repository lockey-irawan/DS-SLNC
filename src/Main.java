public class Main {

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.insertAfter(1);
        ll.insertAfter(2);
        ll.insertAfter(3);
        ll.insertAfter(4);
        ll.insertAfter(5);

        ll.traverse();

        ll.insertBefore(6);
        ll.insertBefore(7);
        ll.insertBefore(8);
        ll.insertBefore(9);
        ll.insertBefore(10);

        ll.traverse();

        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();
        ll.removeLast();

        ll.traverse();

    }

}
