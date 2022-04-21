package rt.codewars.task38;
//https://www.codewars.com/kata/5648b12ce68d9daa6b000099/train/java

import java.util.ArrayList;

public class Solution {

    public static void main(String[] args) {

        ArrayList<int[]> list = new ArrayList<int[]>();
        list.add(new int[] {10,0});
        list.add(new int[] {3,5});
        list.add(new int[] {2,5});
        System.out.println(countPassengers(list));

    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int in = 0;
        int out = 0;

        for (int[] item : stops) {
            in = in + item[0];
            out = out + item[1];
        }

        return (in - out);
    }
}
