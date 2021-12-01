package rt.codewars.task30;

public class Solution {
    public static void main(String[] args) {
        System.out.println(abbrevName("patrick feeney"));
    }


    public static String abbrevName(String name) {

        StringBuilder sb = new StringBuilder();
        String[] strArr = name.split(" ");
        char[] charArr0 = strArr[0].toCharArray();
        char[] charArr1 = strArr[1].toCharArray();
        sb.append(Character.toUpperCase(charArr0[0]));
        sb.append(".");
        sb.append(Character.toUpperCase(charArr1[0]));

        return sb.toString();
    }
}
