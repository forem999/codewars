// https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java

package rt.codewars.task22;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {

        System.out.println(reversString("hello"));

    }


    public static String reversString(String str) {
        // Your code here...

        StringBuilder sb = new StringBuilder();
        char[] charArr = str.toCharArray();
        for (int k = charArr.length - 1; k >= 0; k--) {
            sb.append(charArr[k]);
        }
        return sb.toString();
    }


}
