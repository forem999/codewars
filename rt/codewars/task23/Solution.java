// https://www.codewars.com/kata/58fa273ca6d84c158e000052/train/java


package rt.codewars.task23;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Digits(1234555333L));

    }

    public static int Digits(long n) {
        return  Long.toString(n).length();
        }
}
