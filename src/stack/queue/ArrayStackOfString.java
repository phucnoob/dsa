package stack.queue;

public class ArrayStackOfString implements StackOfString {

    private final String[] innerData;
    private int size;

    ArrayStackOfString(int capacity) {
        innerData = new String[capacity];
        size = 0;
    }

    @Override
    public void push(String item) {
        innerData[size++] = item;
    }

    @Override
    public String pop() {
        return innerData[--size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

}
