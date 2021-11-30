// https://www.codewars.com/kata/55b051fac50a3292a9000025/train/java


package rt.codewars.task25;


import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(filterString("0a1b2c3"));
    }

    public static long filterString(final String value) {
        StringBuilder sb = new StringBuilder();
        char[] charArr = value.toCharArray();
        Character[] digArr = {'0','1','2','3','4','5','6','7','8','9'};
        Set<Character> digSet = Set.of(digArr);

        for (char ch: charArr) {
            if (digSet.contains(ch)) {
                sb.append(ch);
            }
        }
        return Long.parseLong(sb.toString());
    }
}
