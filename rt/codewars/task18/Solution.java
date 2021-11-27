// https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java

package rt.codewars.task18;

public class Solution {

    public static void main(String[] args) {
        System.out.println(greet("Ryan"));

        System.out.println(greet2("Ryan"));
    }

    public static String greet(String name)
    {
        // Your code here
        return "Hello, " + name + " how are you doing today?";
    }

    public static String greet2(String name)
    {
        return String.format("Hello, %s how are you doing today?", name);
    }

}
