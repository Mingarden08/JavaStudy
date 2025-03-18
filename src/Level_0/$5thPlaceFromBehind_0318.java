package Level_0;

import java.util.Arrays;

public class $5thPlaceFromBehind_0318 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14, 56, 32, 10};
        int[] answer = new int[num_list.length - 5];
        Arrays.sort(num_list);
        int cnt = 5;
        for (int i = 0; i<answer.length; i++) {
            answer[i] = num_list[cnt++];
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
