package Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ElementsAtNIntervals_0226 {
    public static void main(String[] args) {
        int[] num_list = {4, 2, 6, 1, 7, 6};
        int n = 2;
        List<Integer> temp = new ArrayList<>();
        int cnt = 0;
        for (int i = 0; i<num_list.length; i+=n) {
            temp.add(num_list[i]);
        }
        int[] answer = new int[temp.size()];
        for (int i = 0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
