// https://www.codewars.com/kata/5650ab06d11d675371000003/train/java

package rt.codewars.task24;

import java.util.Iterator;

public class Solution {

    public static void main(String[] args) {
        System.out.println(splitInParts("HelloKata", 3));

    }


    public static String splitInParts(String s, int partLength) {
        // your code
        char[] charArr = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        int count = 1;
        for (char ch : charArr) {
            if (count == partLength) {
                sb.append(ch).append(" ");
                count = 1;
            } else {
                sb.append(ch);
                count++;
            }
        }


        return sb.toString().trim();


    }
}
