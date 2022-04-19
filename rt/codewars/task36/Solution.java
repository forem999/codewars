package rt.codewars.task36;
//https://www.codewars.com/kata/554e4a2f232cdd87d9000038/train/java

import java.io.CharArrayReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        System.out.println(makeComplement("ATTGC"));

    }

    public static String makeComplement(String dna)  {
        //Your code
        StringBuilder sb = new StringBuilder();
        CharArrayReader chArrReader = new CharArrayReader(dna.toCharArray());
        char ch = ' ';
        while (true) {
            try {
                if (!chArrReader.ready()) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            try {
                ch = (char) chArrReader.read();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (ch == 'A') {
                sb.append('T');
            }
            if (ch == 'T') {
                sb.append('A');
            }
            if (ch == 'C') {
                sb.append('G');
            }
            if (ch == 'G') {
                sb.append('C');
            }
        }
        return sb.toString();
    }
}
