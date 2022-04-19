package rt.codewars.task35;
//https://www.codewars.com/kata/5390bac347d09b7da40006f6/train/java


public class Solution {

    public static void main(String[] args) {
        System.out.println(toJadenCase(""));

    }

    public static String toJadenCase(String phrase) {
        // TODO put your code below this comment
        if (phrase == null) {
            return null;
        }
        if ("".equals(phrase)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        char[] chArr = phrase.toCharArray();
        sb.append(Character.toUpperCase(chArr[0]));
        for (int i = 1; i < chArr.length; i++) {
            if (chArr[i-1] == ' ') {
                sb.append(Character.toUpperCase(chArr[i]));
            } else {
                sb.append(chArr[i]);
            }
        }
        return sb.toString();
    }
}
