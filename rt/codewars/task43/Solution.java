package rt.codewars.task43;
//https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

    }

    public static int grow(int[] x){
        int result = 1;
        for (int i : x) {
            result = result * i;
        }
        return result;
    }

}
