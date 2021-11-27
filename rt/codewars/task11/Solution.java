package rt.codewars.task11;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Solution.countDuplicateChar1("aaaaaaaaaaasssssssssssd"));
        System.out.println(Solution.countDuplicateChar2("aaaaaaaaasssssssssssd"));
    }

    public static  Map<Character, Integer> countDuplicateChar1(String str) {
        Map<Character, Integer> result = new HashMap<>();
        char[] charArr = str.toCharArray();
        for (char c : charArr) {
            result.compute(c, (k, v) -> (v==null) ? 1 : ++v );
        }
        return  result;
    }

    public static Map<Character, Long> countDuplicateChar2 (String str) {
        Map<Character, Long> result = new HashMap<>();
        result = str.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(c -> c, Collectors.counting() ));
        return result;
    }

}
