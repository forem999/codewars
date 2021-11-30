// https://www.codewars.com/kata/52fba66badcd10859f00097e/train/java

package rt.codewars.task28;

import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }

    public static String disemvowel(String str) {
        // Code away...
        Set<Character> vowels = Set.of('e','u','i','o','a');
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        for (char ch : charArr) {
            if (!vowels.contains(Character.toLowerCase(ch))) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
