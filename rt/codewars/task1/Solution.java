package rt.codewars.task1;

public class Solution {
    public static void main(String[] args) {
        int[] i = new int[] {0,1,2,3,4,5,6,7,8,9};
        System.out.println(createPhoneNumber(i));
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        return ("("+numbers[0]+numbers[1]+numbers[2]+") "+numbers[3]+numbers[4]+numbers[5]+
                "-"+numbers[6]+numbers[7]+numbers[8]+numbers[9]);
    }
}


