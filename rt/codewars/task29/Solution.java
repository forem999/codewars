// https://www.codewars.com/kata/59c5f4e9d751df43cf000035/train/java

package rt.codewars.task29;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solve("ultrarevolutionariees"));
        System.out.println(solve("mnopqriouaeiopqrstuvwxyuaeiouaeiou"));

    }


    public static int solve(String s){
        Set<Character> vowels = Set.of('e','u','i','o','a');
        char[] charArr = s.toCharArray();
        int count = 0;
        List<Integer> vowCount = new ArrayList<>();

        for (char ch : charArr) {
            if (vowels.contains(ch)) {
                count++;
                vowCount.add(count);
            } else {
                count = 0;
            }

        }

        return Collections.max(vowCount);
    }
}
