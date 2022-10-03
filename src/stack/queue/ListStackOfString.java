package stack.queue;

import edu.princeton.cs.algs4.StdIn;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ListStackOfString implements StackOfString {

    private Node first = null;

    private class Node {
        String item;
        Node next;
    }

    @Override
    public void push(String item) {
        Node oldFirst = first;
        first = new Node();
        first.item = item;
        first.next = oldFirst;
    }

    @Override
    public String pop() {
        Node oldFirst = first;
        first = first.next;
        return oldFirst.item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return 0;
    }

    public static void main(String[] args) throws FileNotFoundException {
        if (args.length > 0) {
            System.setIn(new FileInputStream(args[0]));
        }

        StackOfString stack = new ArrayStackOfString(10);
        while(!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (item.equals("-")) {
                System.out.println(stack.pop());
            } else {
                stack.push(item);
            }
        }
    }
}
