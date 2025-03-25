package Level_0;

import java.util.Arrays;

public class ChangeOrder_0324 {
    public static void main(String[] args) {
        int[] num_list = {5, 2, 1, 7, 5};
        int n = 3;
        int[] answer = new int[num_list.length];
        int cnt = 0;
        for (int i = n; i<num_list.length; i++) {
            answer[cnt++] = num_list[i];
        }
        for (int i = 0; i < n; i++) {
            answer[cnt++] = num_list[i];
        }
        System.out.println(Arrays.toString(answer));



    }
}
