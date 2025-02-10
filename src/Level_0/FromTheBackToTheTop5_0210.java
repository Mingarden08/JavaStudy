package Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FromTheBackToTheTop5_0210 {
    public static void main(String[] args) {
        int[] num_list = {12, 4, 15, 46, 38, 1, 14};
        int[] answer = new int[5];
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i<num_list.length; i++) {
            temp.add(num_list[i]);
        }
        temp.sort(Comparator.naturalOrder());
        for (int i = 0; i<5; i++) {
            answer[i] = temp.get(i);
        }
        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
