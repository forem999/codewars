package rt.codewars.task3;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

    }

    public static List<String> number(List<String> lines) {
        int i = 1;
        List<String> result = new ArrayList<>();

        for (String s : lines) {
            result.add(i + ": " + s);
            i += 1;
        }
        return result;
    }
}




