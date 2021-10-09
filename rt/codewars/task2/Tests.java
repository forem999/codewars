package rt.codewars.task2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Tests {

    @Test
    public void basicTest() {
        assertEquals (4, Solution.powOfTwo(2));
        assertEquals (8, Solution.powOfTwo(3));
    }


}
