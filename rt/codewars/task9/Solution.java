package rt.codewars.task9;

public class Solution {

    public static int[] paintLetterboxes(final int start, final int end) {
        // Your code here
        int[] result = new int[]{0,0,0,0,0,0,0,0,0,0};
        for (int i = start; i <=  end; i++) {
            for (char c : Integer.toString(i).toCharArray()) {
                switch (c) {
                    case '0':
                        result[0] += 1;
                        break;
                    case '1':
                        result[1] += 1;
                        break;
                    case '2':
                        result[2] += 1;
                        break;
                    case '3':
                        result[3] += 1;
                        break;
                    case '4':
                        result[4] += 1;
                        break;
                    case '5':
                        result[5] += 1;
                        break;
                    case '6':
                        result[6] += 1;
                        break;
                    case '7':
                        result[7] += 1;
                        break;
                    case '8':
                        result[8] += 1;
                        break;
                    case '9':
                        result[9] += 1;
                        break;
                }
            }
        }


        return result;
    }
}
