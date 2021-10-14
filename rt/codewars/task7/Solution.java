package rt.codewars.task7;

public class Solution {

    public static void main(String[] args) {
        System.out.println(camelCase("HelloWorlD"));
    }

    public static String camelCase(String input) {

        if (input == null) {
            return "";
        }

        char[] charList;
        charList = input.toCharArray();
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (char c : charList) {

            if (first) {
                result.append(c);
                first = false;
                continue;
            }
            if ( ((int) c >= 65 ) && ( (int) c <= 90) ) {
            result.append(" " + c);
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }
}
