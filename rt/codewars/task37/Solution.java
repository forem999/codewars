package rt.codewars.task37;
//https://www.codewars.com/kata/555086d53eac039a2a000083/train/java

public class Solution {
    public static void main(String[] args) {
        System.out.println(isLove(8,4));
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if ( (flower1%2 == 0 && flower2%2 !=0) || (flower1%2 != 0 && flower2%2 == 0)) {
            return true;
        }
        return false;
    }

}
