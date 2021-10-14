package rt.codewars.task6;

public class Solution {
    public static void main(String[] args) {
        System.out.println(arithmetic(6,3,"add"));

    }

    public static int arithmetic(int a, int b, String operator) {
        // your code here
        switch (operator) {
            case "add":
                return a + b;
            case "subtract":
                return a - b;
            case "multiply":
                return a*b;
            case "divide":
                return a/b;
            default:
                return 0;
        }

    }

}
