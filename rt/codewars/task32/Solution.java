// https://www.codewars.com/kata/5412509bd436bd33920011bc/train/java


package rt.codewars.task32;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maskify("4556364607935616"));
    }


    public static String maskify(String str) {

        StringBuilder sb = new StringBuilder(str);
        if (sb.length() <= 4) {
            return sb.toString();
        } else {
            for (int i = 0; i < sb.length() - 4; i++) {
                sb.setCharAt(i, '#');
            }
            return sb.toString();
        }

    }
}
