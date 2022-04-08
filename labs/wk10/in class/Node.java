public class Node {
    private int value;
    private Node previous;
    private Node next;
    
    public Node(int value) {
        this.value = value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }
    // 1 -> 2 -> 3 -> 4 -> NULL
    public static void print(Node head) {
        while (head != null) {
            System.out.print(head.getValue() + " -> ");
            head = head.getNext();
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        // 1 <-> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        Node current = head;
        for (int i = 2; i <= 5; i++) {
            Node n = new Node(i);
            current.setNext(n);
            n.setPrevious(current);
            current = n;
        }   
        print(head);
    }
}
