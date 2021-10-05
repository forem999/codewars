package rt.codewars.task2;

import java.util.List;

public class Solution {

    public static void main(String[] args) {

    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int summ = 0;

        for (int i : binary) {
            summ += i;
        }


        return summ;
    }

}
