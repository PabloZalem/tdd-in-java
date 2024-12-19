import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class QueueTest {

    @Test
    public void createQueue() {
        var queue = new Queue();
        assertTrue(queue.isEmpty());
    }
}
