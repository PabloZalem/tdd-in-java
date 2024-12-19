import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class QueueTest {
    Queue queue;

    @Before
    public void setup() {
        queue = new Queue();
    }

    @Test
    public void createQueue() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void enqueueElement() {
        queue.enqueue(0);
        assertFalse(queue.isEmpty());
    }

    @Test
    public void dequeueElement() {
        queue.enqueue(0);
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }
}
