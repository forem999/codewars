// https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java

package rt.codewars.task26;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(check(new Object[] {66, 101}, 66));
        System.out.println(check(new Object[] {80, 117, 115, 104, 45, 85, 112, 115}, 451));
        System.out.println(check(new Object[] {'t', 'e', 's', 't'}, 'e'));
    }


    public static boolean check(Object[] a, Object x) {
        // Your code here
        for (Object i : a) {
            if (x.equals(i)) {
                return true;
            }
        }

        return false;
    }

    public static boolean check2(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }

}
