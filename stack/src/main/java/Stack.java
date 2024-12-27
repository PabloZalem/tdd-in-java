public class Stack {
    private int size = 0;
    private int[] elements = new int[2];

    public boolean isEmpty() {
        return size == 0;
    }

    public void push(int element) {
        if (this.size >= elements.length) throw new OverflowException();
        this.elements[size++] = element;
    }

    public int pop() {
        if (this.size == 0) throw new UnderflowException();
        return elements[--size];
    }

    public int getSize() {
        return size;
    }

    public class UnderflowException extends RuntimeException{
    }

    public class OverflowException extends RuntimeException{
    }
}
