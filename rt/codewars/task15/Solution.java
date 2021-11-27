// https://www.codewars.com/kata/5556282156230d0e5e000089/train/java

package rt.codewars.task15;

public class Solution {

    public static void main(String[] args) {

        System.out.println(dnaToRna("UTTHDTRRRTTT"));

    }


    public static String dnaToRna(String dna) {
        char[] charArr = dna.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (char ch : charArr) {
            if (ch == 'T') {
                builder.append('U');
            } else {
                builder.append(ch);
            }
        }
        return builder.toString();  // Do your magic!
    }


}
