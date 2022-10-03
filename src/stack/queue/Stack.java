package stack.queue;

import java.util.Iterator;

public class Stack<Item> implements Iterable<Item> {
    private Node first = null;

    @Override
    public Iterator<Item> iterator() {
        return new Iterator<>() {
            private Node current = first;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Item next() {
                Item item = current.item;
                current = current.next;
                return item;
            }
        };
    }

    private class Node {
        Item item;
        Node next;

        public Node(Item item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    public void push(Item item) {
        Node oldFirst = first;
        first = new Node(item, oldFirst);
    }

    public Item pop() {
        Item value = first.item;
        first = first.next;

        return value;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Ahihi");
        stack.push("ko");
        stack.push("cài đặt");
        stack.push("stack");
        stack.push("được");

        System.out.println(stack.pop());

        for (String item: stack) {
            System.out.println(item);
        }
    }
}
