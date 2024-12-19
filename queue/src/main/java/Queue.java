public class Queue {
    private boolean empty = true;
    private int size = 0;
    private int[] elements = new int[2];
    private int contador = 0;

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        contador = 0;
        this.elements[size++] = element;
    }

    public int dequeue() {
        if (size == 0) throw new UnderflowException();
        --size;
        return elements[contador++];
    }

    public int getSize() {
        return size;
    }

    public class UnderflowException extends RuntimeException{
    }
}
