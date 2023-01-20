import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BalancedWordsCounterTest {

    @Test
    public void testCount() throws Exception {
        assertEquals(28, new BalancedWordsCounter().count("aabbabcccba"));
        assertEquals(0, new BalancedWordsCounter().count(""));
    }

    @Test(expected = Exception.class)
    public void testCount_otherCharacters() throws Exception {
        new BalancedWordsCounter().count("abababa1");
    }

    @Test(expected = Exception.class)
    public void testCount_nullInput() throws Exception {
        new BalancedWordsCounter().count(null);
    }
}
