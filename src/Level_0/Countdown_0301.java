package Level_0;

import java.util.Arrays;

public class Countdown_0301 {
    public static void main(String[] args) {
        int start_num = 10;
        int end_num = 3;
        int[] answer = new int[start_num-end_num+1];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = start_num--;
        }
        System.out.println(Arrays.toString(answer));
    }
}
