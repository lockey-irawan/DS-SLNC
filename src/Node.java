public class Node {

    // attributes

    public int value;
    public Node next;

    // constructor

    public Node() {
        next = null;
    }

    public Node(int v) {
        value = v;
        next = null;
    }

    // function

    public String toString() {
        return value + "";
    }

}
