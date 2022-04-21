package rt.codewars.task39;
//https://www.codewars.com/kata/577a98a6ae28071780000989/train/java

public class Solution {
    public static void main(String[] args) {

    }

    public int min(int[] list) {
        int min = 0;
        for (int i : list) {
            min = i < min ? i : min;
        }

        return min;
    }

    public int max(int[] list) {
        int max = 0;
        for (int i : list) {
            max = i > max ? i : max;
        }
        return max;
    }
}
