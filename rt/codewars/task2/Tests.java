package rt.codewars.task2;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class Tests {

    @Test
    public void basicTest() {
        assertEquals (4, Solution.powOfTwo(2));
        assertEquals (8, Solution.powOfTwo(3));
    }


}
