public class Node {

    // attr

    public int value;
    public Node next;

    // constr

    public Node() {
        next = null;
    }

    public Node(int v) {
        value = v;
        next = null;
    }

    // func

    public String toString() {
        return value + "";
    }

}
