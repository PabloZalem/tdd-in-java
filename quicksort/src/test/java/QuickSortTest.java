import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class QuickSortTest {
    @Test
    public void quickSort() {
        assertEquals(asList(1), sort(asList(1)));
        assertEquals(asList(1, 2), sort(asList(1, 2)));
        assertEquals(asList(1, 2), sort(asList(2, 1)));
        assertEquals(asList(1, 2, 3), sort(asList(1, 2, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(2, 1, 3)));
        assertEquals(asList(1, 2, 3), sort(asList(3, 2, 1)));
        assertEquals(asList(1, 2, 3, 4), sort(asList(1, 2, 3, 4)));
    }

    private List<Integer> sort(List<Integer> list) {
        if (list.size() <= 1) {
            return list;
        } else {
            int middle = list.get(0);

            List<Integer> middles = list.stream().filter(x -> x == middle).collect(Collectors.toList());
            List<Integer> lesser = list.stream().filter(x -> x < middle).collect(Collectors.toList());
            List<Integer> greater = list.stream().filter(x -> x > middle).collect(Collectors.toList());

            List<Integer> result = new ArrayList<>();
            result.addAll(sort(lesser));
            result.addAll(middles);
            result.addAll(sort(greater));
            return result;
        }
    }
}
