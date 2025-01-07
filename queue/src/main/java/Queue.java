public class Queue {
    private int size = 0;
    private int[] elements = new int[2];
    private int acc = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (size >= elements.length)throw new OverflowException();
        acc = 0;
        this.elements[size++] = element;
    }

    public int dequeue() {
        if (size == 0) throw new UnderflowException();
        size--;
        return elements[acc++];
    }

    public int getSize() {
        return size;
    }

    public class UnderflowException extends RuntimeException{
    }

    public class OverflowException extends RuntimeException{
    }
}
