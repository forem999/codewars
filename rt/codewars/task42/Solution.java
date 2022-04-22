package rt.codewars.task42;
//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class Solution {
    public static void main(String[] args) {
        System.out.println(validatePin("123a"));
    }

    public static boolean validatePin(String pin) {

        // Your code here...
        char[] chArr = pin.toCharArray();

        if ((pin.length() == 4) || (pin.length() == 6)) {
            for (char ch : chArr) {
                if (ch < 48 || ch > 57) {
                    return false;
                }
            }
        } else return false;

        return true;
    }
}
