package Level_0;

import java.util.Arrays;

public class IcedAmericano_0206 {
    public static void main(String[] args) {
        int money = 5500;
        int[] answer = new int[2];
        answer[0] = money/5500;
        answer[1] = money - 5500 * answer[0];
        System.out.println(Arrays.toString(answer));
    }
}
