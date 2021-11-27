// https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java


package rt.codewars.task19;

public class Solution {

    public static void main(String[] args) {
        stringToArray("I love arrays they are my favorite");
    }



    public static String[] stringToArray(String s) {
        //your code;
        return s.split("\\W+");
    }

}
