//  https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java

package rt.codewars.task21;

public class Solution {

    public static void main(String[] args) {
        System.out.println(reverseWords("Hello hello we won[!]"));
    }

    public static String reverseWords(String str){
        //write your code here...
        String[] strArr = str.split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s: strArr) {
            sb.insert(0, s);
            sb.insert(0," ");
        }
        sb.delete(0,1);
        return sb.toString();

    }
}
