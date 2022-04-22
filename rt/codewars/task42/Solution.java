package rt.codewars.task42;
//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean validatePin(String pin) {
        // Your code here...
        if ((pin.length()!=4) || (pin.length()!=6)){
            return false;
        }
        return true;
    }
}
