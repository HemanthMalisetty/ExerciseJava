import org.junit.Test;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class Exercise17Test {
    @Test
    public void test_getTriangle() {
        assertEquals(new Exercise17().getValidNumbers(), Arrays.asList(153, 370, 371, 407, 1634, 8208, 9474, 54748, 92727, 93084));
    }
}
