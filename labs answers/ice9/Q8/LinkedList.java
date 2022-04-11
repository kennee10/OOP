public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList() {
        length = 0;
    }   

    //adds the element at the end
    public void add(int element) {
        Node node = new Node(element);

        if (length++ == 0) {
            head = node;
            tail = node;
            return;
        }
        
        tail.setNext(node);
        node.setPrevious(tail);
        tail = node;
    }

    //adds the element at the position specified
    public void add(int position, int element) {
        Node node = new Node(element);
        if (position >= length || position < 0) {    
            System.out.println("add: Invalid Position " + position);
            return;
        }else if (position == length){ //considering it as equivalent to adding to end
            add(element);
            return;
        }
        
        Node temp = head;
        //traverse index number of times to get the node at that index
        for (int i = 0; i < position ; i++) {
            temp = temp.getNext();
        }

        Node previous = temp.getPrevious();
        node.setPrevious(previous);
        
        node.setNext(temp);        
        temp.setPrevious(node);

        if (previous == null) {
            head = node;
        } else {
            previous.setNext(node);
        }

        length++;
    }

    public void remove() {  //removes the first node
        head = head.getNext();
        head.setPrevious(null);
        length--;
    }

    public void remove(int position) {
        if (position >= length || position < 0) {
            System.out.println("Remove: Invalid Position " + position);
            return;
        }

        if (position == 0) {
            remove();
            return;
        }

        Node temp = head;
        for (int i = 0; i < position; i++) {
            temp = temp.getNext();
        }

        Node previous = temp.getPrevious();
        Node next = temp.getNext();
        previous.setNext(next);
        if (next != null) {
            next.setPrevious(previous);
        }
        length--;
    }
    
    
    //getters
    public int size() {
        return length;
    }

    public Node getHead() {
        return head;
    }    

    public Node getTail() {
        return tail;
    }
    

}