import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {
    @Test
    public void bubbleSort() {
        assertEquals(asList(1), sort(asList(1)));
        assertEquals(asList(1, 2), sort(asList(1, 2)));
        assertEquals(asList(1, 2), sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(3, 2, 1)));
    }

    private List<Integer> sort(List<Integer> list) {
        if (list.size() > 1) {
            for (int limit = list.size() - 1; limit > 0; limit--) {
                for (int firstIndex = 0; firstIndex < list.size() - 1; firstIndex++) {
                    int secondIndex = firstIndex + 1;
                    if (list.get(firstIndex) > list.get(secondIndex)) {
                        int first = list.get(firstIndex);
                        int second = list.get(secondIndex);
                        list.set(firstIndex, second);
                        list.set(secondIndex, first);
                    }
                }
            }
        }
        return list;
    }
}
