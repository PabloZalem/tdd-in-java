public class Queue {
    private boolean empty = true;
    private int size = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        size++;
    }

    public void dequeue() {
        --size;
    }

    public int getSize() {
        return size;
    }
}
