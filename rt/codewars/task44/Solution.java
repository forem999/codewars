package rt.codewars.task44;
//https://www.codewars.com/kata/526989a41034285187000de4/train/java

public class Solution {

    public static void main(String[] args) {

        System.out.println(ipsBetween("10.0.0.0", "10.0.0.50"));
        System.out.println(ipsBetween("20.0.0.10", "20.0.1.0"));
        System.out.println(ipsBetween("0.0.0.0", "255.255.255.255"));
    }

    public static long ipsBetween(String start, String end) {

        String[] stLst = start.split("\\.");
        String[] enLst = end.split("\\.");

        for (int i = 0; i < 4; i++) {
            stLst[i] = Integer.toBinaryString(Integer.parseInt(stLst[i]));
            enLst[i] = Integer.toBinaryString(Integer.parseInt(enLst[i]));
        }

        for (int i = 0; i < 4; i++) {
            stLst[i] = "0".repeat(8 - stLst[i].length()) + stLst[i];
            enLst[i] = "0".repeat(8 - enLst[i].length()) + enLst[i];
        }

        StringBuilder stStr = new StringBuilder();
        StringBuilder enStr = new StringBuilder();

        for (int i = 0; i < 4; i++) {
            stStr.append(stLst[i]);
            enStr.append(enLst[i]);
        }

        return (Long.parseLong(enStr.toString(),2) - Long.parseLong(stStr.toString(),2));
    }
}
