package rt.codewars.task40;
//https://www.codewars.com/kata/5601409514fc93442500010b/train/java

import java.util.Arrays;

public class Solution {
    public  static  void main (String[] args){

    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        // Your code here
        return Arrays.stream(classPoints).sum()/classPoints.length >= yourPoints ? false : true;
    }


}
