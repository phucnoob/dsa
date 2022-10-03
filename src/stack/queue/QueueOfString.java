package stack.queue;

public interface QueueOfString {
    void enqueue(String item);
    String dequeue();
    boolean isEmpty();
    int size();
}
