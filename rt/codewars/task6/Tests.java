package rt.codewars.task6;

import org.junit.Test;
import static org.junit.Assert.*;

public class Tests {

    @Test
    public void arithmeticShouldAddTwoInts() {
        assertEquals (9, Solution.arithmetic(6,3,"add"));
    }
    @Test
    public void arithmeticShouldSubtractTwoInts () {
        assertEquals(-4, Solution.arithmetic(6, 10, "subtract"));
    }


}
