// https://www.codewars.com/kata/55b3425df71c1201a800009c/train/java


package rt.codewars.task20;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        stat("01|15|59, 1|47|16, 01|17|20, 1|32|34, 2|17|17");

    }


    public static String stat(String strg) {
        // your code
        List<Integer> list = new ArrayList<>();
        String[] strArr = strg.split(",\\W+");
        for (String s : strArr) {
            String[] subStrArr = s.split("\\|");
            int sum;
            sum = Integer.parseInt(subStrArr[0]) * 60 * 60 +
                        Integer.parseInt(subStrArr[1]) * 60 +
                        Integer.parseInt(subStrArr[2]);
            list.add(sum);

        }

        System.out.println(list);

        return "OK";


    }


}
