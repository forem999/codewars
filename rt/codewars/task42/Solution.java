package rt.codewars.task42;
//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        System.out.println(validatePin("1234"));

    }

    public static boolean validatePin(String pin) {
        // Your code here...
       if ((pin.length()!=4) || (pin.length()!=6)){
            return false;
        }
        char[] dig = {'0','1','2','3','4','5','6','7','8','9'};
        Set chSet = new HashSet<Character>();
        chSet.add(dig);
        char[] chArr = pin.toCharArray();
        boolean flag = true;
        for (char ch : chArr) {
            if (!chSet.contains(ch)) {
                flag = false;
            }
        }
        return flag;
    }
}
