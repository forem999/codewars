// https://www.codewars.com/kata/56786a687e9a88d1cf00005d/train/java

package rt.codewars.task14;

import java.util.HashMap;
import java.util.HashSet;


public class Solution {

    public static void main(String[] args) {
        validateWord("aabbrr");
    }


    public static boolean validateWord(String word) {
        // your code here
        char[] chars= word.toLowerCase().toCharArray();
        HashMap<Character, Integer> charMap = new HashMap<>();
        for (char ch : chars) {
            charMap.compute(ch, (k, v) -> (v==null) ? 1 : ++v );
        }
        System.out.println(charMap.values());
        HashSet<Integer> hset = new HashSet<>(charMap.values());
        return hset.size() > 1 ? false : true;

    }
}
