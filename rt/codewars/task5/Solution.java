package rt.codewars.task5;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        System.out.println(stray(new int[]{2,1,1,1,1}));

    }

    static int stray(int[] numbers) {
        Set<Integer> s = new HashSet<>();
        for (int x : numbers) {
            if (!s.contains(x)) {
                s.add(x);
            } else {
                s.remove(x);
            }
        }
        return s.hashCode();
    }
}
