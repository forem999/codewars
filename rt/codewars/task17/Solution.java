package rt.codewars.task17;

public class Solution {

    public static void main(String[] args) {
        System.out.println(solution("test"));
        System.out.println(solution("qwertyuiopasdfghjklzxcvbnm"));

        System.out.println(solution2("qwertyuiopasdfghjklzxcvbnm"));

    }



    public static String solution(String str) {
        // Your code here...
        char[] charArr = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = charArr.length-1; i >= 0; i-- ) {
            sb.append(charArr[i]);
        }
        return sb.toString();
    }

    public static String solution2(String str) {
        return new StringBuilder(str).reverse().toString();
    }


}
