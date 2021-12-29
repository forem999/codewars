package rt.codewars.task33;

//https://www.codewars.com/kata/5ca24526b534ce0018a137b5/train/java



public class Solution {

    public static void main(String[] args) {

    }

    public static String sendMessage(String message) {

        StringBuilder sb = new StringBuilder();
        boolean upFlag = false;
        int count = 0;
        char[] charArr = message.toCharArray();
        char curChar =' ';
        for (char c : charArr) {
            if (c == curChar) {
                count++;
            } else {
                curChar = c;
                count = 0;
            }

        }

        return message;
    }


}
