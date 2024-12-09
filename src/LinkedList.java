public class LinkedList {

    // attr
    // let's add a tail, so the process become a little bit easy

    public Node head;
    public Node tail; // this node will flag the last node at the list

    public LinkedList() {
        head = tail = null; // it means empty list
    }

    // functions

    public boolean isEmpty() {
        return head == null;
    }

    // insert new node at the last position
    public void insertAfter(int v) {

        Node newNode = new Node(v); // create new node

        if (isEmpty()) {
            head = tail = newNode; // if the list empty, put it as the first node
        } else {

//            Node helper = head; // if not, find the last node position, and put it there
//
//            while (helper.next != null) {
//                helper = helper.next;
//            }

//            helper.next = newNode;

            tail.next = newNode;
            tail = newNode;
        }

        System.out.println("inserted !");
    }

    // insert new node at the first position
    // tail doesnt change this one
    public void insertBefore(int v) {

        Node newNode = new Node(v);

        if (isEmpty()) {

            head = newNode; // if empty, then put it as the fist node

        } else {

            newNode.next = head; // if not ! connect the next of newNode to head, and update the head
            head = newNode;

        }

        System.out.println("inserted !!");

    }

    public void traverse() {

        if (!isEmpty()) {

            Node helper = head;

            while (helper != null) {
                System.out.print(helper + " -> ");
                helper = helper.next;
            }

            System.out.println("null");

        }

    }

    // the idea is to remove the first node in the list and don't screw the other
    // and also doesnt affect this one
    public void removeFirst() {

        if (!isEmpty()) {

            head = head.next;
            System.out.println("removed !");

        } else {
            System.out.println("empty list !");
        }
    }

    // this one will remove the last node in the list
    // but this one
    public void removeLast() {

        if (!isEmpty()) {

            Node helper = head;

            if (helper == tail) {
                head = tail = null;
            } else {

                // this code only works when there is 2 or more node;
                while (helper.next != tail) {
                    helper = helper.next;
                }

                helper.next = null; // yay !!
                tail = helper;
            }

            System.out.println("removed !"); // lets try this one !

        } else {
            System.out.println("empty list !!");
        }

    }

}
