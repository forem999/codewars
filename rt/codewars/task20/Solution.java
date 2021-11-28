// https://www.codewars.com/kata/55b3425df71c1201a800009c/train/java


package rt.codewars.task20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {

        stat("02|15|59, 2|47|16, 02|17|20, 2|32|34, 2|17|17, 2|22|00, 2|31|41");

    }


    public static String stat(String strg) {
        // your code
        List<Integer> list = new ArrayList<>();
        String[] strArr = strg.split(",\\W+");
        for (String s : strArr) {
            String[] subStrArr = s.split("\\|");
            int sum;
            sum = Integer.parseInt(subStrArr[0]) * 60 * 60 +
                        Integer.parseInt(subStrArr[1]) * 60 +
                        Integer.parseInt(subStrArr[2]);
            list.add(sum);

        }

        StringBuilder sb = new StringBuilder();

        // find Range
        int max = Collections.max(list);
        int min = Collections.min(list);
        int Range = max-min;

        sb.append("Range: ");
        sb.append(formatStr(Range));
    //  System.out.println(sb);


        // find Average
        int MoA = 0;
        int summ = 0;
        for (int e : list) summ += e;
        MoA = summ / list.size();

        sb.append(" Average: ");
        sb.append(formatStr(MoA));
    //    System.out.println(sb);

        // find Median

        int median = 0;

        Collections.sort(list);

        if (list.size()%2 > 0 ) {
            median = list.get(list.size()/2);
        } else {
            median = (list.get(list.size()/2 - 1)  + list.get(list.size()/2))/2;
        }

        sb.append(" Median: ");
        sb.append(formatStr(median));
    //    System.out.println(sb);

        return sb.toString();


    }

    public static String formatStr (int value) {
        StringBuilder sb = new StringBuilder();
        if (value/3600 > 9) {
            sb.append(value/3600);
            sb.append("|");
        } else {
            sb.append("0");
            sb.append(value/3600);
            sb.append("|");
        }

        if ((value%3600)/60 > 9 ) {
            sb.append((value%3600)/60);
            sb.append("|");
        } else {
            sb.append("0");
            sb.append((value%3600)/60);
            sb.append("|");
        }

        if ((value%3600)%60 > 9 ) {
            sb.append((value%3600)%60);
        } else {
            sb.append("0");
            sb.append((value%3600)%60);
        }
        return sb.toString();

    }


}
