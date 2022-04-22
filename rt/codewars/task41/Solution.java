package rt.codewars.task41;
//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java

public class Solution {
    public static void main(String[] args) {

    }

    public static boolean getXO (String str) {
        // Good Luck!!
        char[] chArr = str.toCharArray();
        int o = 0;
        int x = 0;
        for (char ch : chArr) {
            o = Character.toLowerCase(ch) == 'o' ? o + 1 : o;
            x = Character.toLowerCase(ch) == 'x' ? x + 1 : x;
        }
        return x == o ? true : false;
    }
}
