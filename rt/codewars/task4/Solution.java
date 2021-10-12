package rt.codewars.task4;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int[] test = new int[] {0,0,1,1,1,5,5};
        findIt(test);
    }




    public static int findIt(int[] a) {

        Set<Integer> s = new HashSet<>();

        for (int x : a) {
            if (s.contains(x)) {
                s.remove(x);
            } else {s.add(x);}
        }
/*        System.out.println(s);
        System.out.println(s.hashCode()); */
        return s.hashCode();
    }
}
