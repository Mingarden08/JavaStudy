package Level_0;

import java.util.Arrays;

public class MakeMaxValue_0103 {
    public static void main(String[] args) {
        int answer = 0; int[] number = {0, 31, 24, 10, 1, 9};
        Arrays.sort(number);
        answer = number[number.length-1] * number[number.length-2];
        System.out.println(answer);
    }
}
