package Level_0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindingDivisors_0131 {
    public static void main(String[] args) {
        int n = 24;
        int[] answer;
        List<Integer> temp = new ArrayList<>();
        for (int i = 1; i<=n; i++) {
            if (n%i == 0) {
                temp.add(i);
            }
        }
        answer = new int[temp.size()];
        for (int i = 0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
