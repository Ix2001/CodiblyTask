import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.assertEquals;

public class BubbleSortTest {

    @Test
    public void testSort() throws Exception {
        assertEquals(Arrays.asList(1,3,4,5,6,8,8), new BubbleSort().sort(Arrays.asList(1,4,5,6,8,3,8)));
        assertEquals(Arrays.asList(-9.3,0.1,0.2,4,5,9), new BubbleSort().sort(Arrays.asList(-9.3,0.2,4,0.1,5,9)));
        assertEquals(Arrays.asList(), new BubbleSort().sort(Arrays.asList()));
        assertEquals(Arrays.asList(5.0001), new BubbleSort().sort(Arrays.asList(null,5.0001)));
    }

    @Test(expected = Exception.class)
    public void testSort_nullInput() throws Exception {
        new BubbleSort().sort(null);
    }
}