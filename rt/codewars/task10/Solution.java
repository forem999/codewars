package rt.codewars.task10;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxBall(37));
    }



    public static int maxBall(int v0) {
        // your code
        Map records = new HashMap();
        double vInMs = (v0*1000)/3600;
        double g = 9.81;
        double t = 0.0;
        double h = 0;
        int k = 0;
        records.put(0, vInMs*t-0.5*g*t*t);

        while (vInMs*t-0.5*g*t*t >= 0) {
            k = k + 1;
            t = t + 0.1;
            records.put(k,vInMs*t-0.5*g*t*t);
        }
        System.out.println(records);
        

        return 1;
    }

}
