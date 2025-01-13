package Level_1;

import java.util.Arrays;

public class FlipNaturalNumbersIntoArray_0113 {
    public static void main(String[] args) {
        long n = 12345;
        String s = n + "";
        int length = (int)(Math.log10(n)+1);
        int[] answer = new int[length];
        int cnt = 0;
        for(int i = length-1; i >= 0; i--) {
            answer[cnt++] = (int)s.charAt(i) - 48;
        }
        System.out.println(Arrays.toString(answer));
    }
}
