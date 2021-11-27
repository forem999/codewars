package rt.codewars.task10;

import java.util.*;
import java.util.HashMap;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxBall(45));
    }



    public static int maxBall(int v0) {
        // your code
        HashMap<Integer, Double> records = new HashMap<>();
        double vInMs = v0/3.6;
        double g = 9.81;
        double t = 0.0;
        int k = 0;
        int result = 0;
        double max = 0;
        records.put(0, vInMs*t-0.5*g*t*t);

        while (vInMs*t-0.5*g*t*t >= 0) {
            k = k + 1;
            t = t + 0.1;
            records.put(k,vInMs*t-0.5*g*t*t);
        }
        System.out.println(records);

        for (Map.Entry<Integer, Double> entry : records.entrySet()) {
            if (entry.getValue() > max ) {
                max = entry.getValue();
                result = entry.getKey();
            }
        }

        return  result;
    }

}
