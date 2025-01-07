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
    public void createQueu() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void enqueueTest() {
        queue.enqueue(0);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void dequeueTest() {
        queue.enqueue(0);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void getSizeElements() {
        queue.enqueue(0);
        queue.enqueue(0);
        assertEquals(2, queue.getSize());
    }

    @Test
    public void throwUnderflowException() {
        assertThrows(Queue.UnderflowException.class,
                () -> queue.dequeue());
    }

    @Test
    public void enqueueXDequeueX() {
        queue.enqueue(10);
        assertEquals(10, queue.dequeue());
        queue.enqueue(20);
        assertEquals(20, queue.dequeue());
    }

    @Test
    public void enqueueXAndYDequeueXAndY() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertEquals(10, queue.dequeue());
        assertEquals(20, queue.dequeue());
    }

    @Test
    public void throwOverflowException() {
        queue.enqueue(10);
        queue.enqueue(20);
        assertThrows(Queue.OverflowException.class,
                () -> queue.enqueue(30));
    }
}
