import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Exsercise01Test {

    @Test
    public void test_findGCD(){
        assertEquals((new Exercise01()).findGCD(12,22),2);
        assertEquals((new Exercise01()).findGCD(0,25),25);
    }

    @Test
    public void test_findLCM(){
        assertEquals((new Exercise01()).findLCM(65, 10),130);
    }
}