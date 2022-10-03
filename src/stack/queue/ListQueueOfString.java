package stack.queue;

public class ListQueueOfString implements QueueOfString {

    private Node first = null;
    private int size = 0;

    public ListQueueOfString() {
    }

    private class Node {

        public Node(String item) {
            this.item = item;
            this.next = null;
        }

        String item;
        Node next;
    }

    @Override
    public void enqueue(String item) {
        Node current = first;
        size++;
        while (current.next != null) {
            current = current.next;
        }

        current.next = new Node(item);
    }

    @Override
    public String dequeue() {
        String item = first.item;
        first = first.next;
        size--;
        return item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    public static void main(String[] args) {

    }
}
