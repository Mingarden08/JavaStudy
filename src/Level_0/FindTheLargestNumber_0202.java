package Level_0;

import java.util.Arrays;

public class FindTheLargestNumber_0202 {
    public static void main(String[] args) {
        int[] array = {1, 8, 3};
        int[] answer = new int[2];
        int temp = array[0];
        for (int i = 0; i<array.length; i++) {
            if (temp < array[i]) {
                temp = array[i];
                answer[1] = i;
            }
        }
        answer[0] = temp;
        System.out.println(Arrays.toString(answer));
    }
}
