// https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java

package rt.codewars.task16;

public class Solution {

    public static void main(String[] args) {
        System.out.println(remove(",jt&_=`A6\\}a[*]"));
    }

    public static String remove(String str) {
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();

        if (charArr.length == 2) return "";
        for (int i = 1; i < charArr.length-1; i++) {
            sb.append(charArr[i]);
        }
        return sb.toString();
        // your code here
    }
}
