// https://www.codewars.com/kata/59d9ff9f7905dfeed50000b0/train/java

package rt.codewars.task33;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        System.out.println(solve(new String[]{"abide","ABc","xyz"}));

    }

    public static int[] solve(String[] arr){
        // do your thing
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        char[] alphaArr = alphabet.toCharArray();

        char[] charArr;
        int count = 0;
        List<Integer> xc = new ArrayList<>();

        for (String s : arr) {
            charArr = s.toCharArray();
            for (int i=0; i < charArr.length; i++) {
                if (Character.toLowerCase(charArr[i]) == alphaArr[i]) {
                    count++;
                }
            }
            xc.add(count);
            count = 0;
        }

        int[] result = new int[xc.size()];
        for (int i =0; i <result.length - 1; i++) {
            result[i] = xc.get(i);
        }


        return result;

    }
}
