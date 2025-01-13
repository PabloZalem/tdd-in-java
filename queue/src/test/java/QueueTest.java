import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {
    Queue queue;

    @Before
    public void setUp() throws Exception {
        queue = new Queue();
    }

    @Test
    public void createQueue() {
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.getSize());
    }

    @Test
    public void enqueueElement() {
        queue.enqueue(0);
        assertFalse(queue.isEmpty());
        assertEquals(1, queue.getSize());
    }

    @Test
    public void dequeueElement() {
        queue.enqueue(0);
        queue.dequeue();
        assertTrue(queue.isEmpty());
        assertEquals(0, queue.getSize());
    }

    @Test
    public void getSizeElement() {
        queue.enqueue(0);
        queue.enqueue(0);
        assertEquals(2, queue.getSize());
    }

    @Test
    public void getThrowUnderflowException() {
        assertThrows(Queue.UnderflowException.class,
                () -> queue.dequeue());
    }

    @Test
    public void enqueueXDequeueX() {
        queue.enqueue(10);
        assertEquals(10, queue.dequeue());
        queue.enqueue(200);
        assertEquals(200, queue.dequeue());
    }

    @Test
    public void enqueueXAndYDequeueXAndY() {
        queue.enqueue(10);
        queue.enqueue(200);
        assertEquals(10, queue.dequeue());
        assertEquals(200, queue.dequeue());
    }

    @Test
    public void throwOverflowException() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertThrows(Queue.OverflowException.class,
                () -> queue.enqueue(30));
    }
}
