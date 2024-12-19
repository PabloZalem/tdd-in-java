public class Queue {
    private boolean empty = true;

    public boolean isEmpty() {
        return empty;
    }

    public void enqueue(int element) {
        empty = false;
    }

    public void dequeue() {
        empty = true;
    }
}
