package Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChooseAMultipleOfN_0130 {
    public static void main(String[] args) {
        int n = 3;
        int[] numlist = {4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer;
        List<Integer> temp = new ArrayList<>();
        for (int i = 0; i<numlist.length; i++)
            if (numlist[i] % n == 0)
                temp.add(numlist[i]);
        answer = new int[temp.size()];
        for (int i = 0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
