// https://www.codewars.com/kata/535474308bb336c9980006f2/train/java

package rt.codewars.task27;

public class Solution {

    public static void main(String[] args) {
        System.out.println(greet("JACK"));
        System.out.println(greet2("JACK"));
    }

    public static String greet(String name){

        StringBuilder sb = new StringBuilder();
        char[] charArr = name.toCharArray();
        sb.append("Hello ");
        sb.append(Character.toUpperCase(charArr[0]));
        for (int i = 1; i < charArr.length; i++) {
            sb.append(Character.toLowerCase(charArr[i]));
        }
        sb.append("!");


        return sb.toString();
    }

    public static String greet2(String name){
        return "Hello " + name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase() + "!";
    }
}
