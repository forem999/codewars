package rt.codewars.task2;

import java.util.List;

public class Solution {

    public static void main(String[] args) {


    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        int summ = 0;

        for (int i = binary.size()-1; i >= 0; i--) {
            if (binary.get(i) == 1) {
                summ = summ + powOfTwo(binary.size() - 1 - i);
            }
        }
        return summ;
    }

    public static int powOfTwo (int pow) {
        if (pow == 0) {
            return 1;
        } else {
            return 2*powOfTwo(pow-1);
        }

    }



}
