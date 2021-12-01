// https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java

package rt.codewars.task31;

public class Solution {

    public static void main(String[] args) {
        System.out.println(bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }

    public static String bumps(final String road) {

        char[] charArr = road.toCharArray();
        int count = 0;

        for (char ch : charArr) {
            if (ch == 'n') count++;
        }

        return count > 15 ? "Car Dead" : "Woohoo!";
    }

    public static String bumps2(final String road) {
        return road.chars().filter(ch -> ch =='n').count()>15? "Car Dead" : "Woohoo!";
    }

}
