package sort.heap;

public class HeapTree<T extends Comparable<T>> {
    private T[] elements;
    private int n;

    public HeapTree(int capacity) {
        elements = (T[]) new Comparable[capacity];
    }

}
