package Level_1;

import java.util.*;

public class ArrayofNumbersThatFallApart_0108 {
    public static void main(String[] args) {
        int[] arr = {2, 36, 1, 3};
        int divisor = 1;
        int cnt = 0;
        List<Integer> temp = new ArrayList<>(1);
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] % divisor == 0) {
                temp.add(arr[i]);
                cnt++;
            }
        }
        temp.sort(Comparator.naturalOrder());
        int[] answer;
        if (cnt == 0) {
            answer = new int[1];
            answer[0] = -1;
            System.out.println(Arrays.toString(answer));
        }
        else {
            answer = new int[temp.size()];
            for (int i = 0; i < cnt; i++) {
                answer[i] = temp.get(i);
            }
            System.out.println(Arrays.toString(answer));
        }
    }
}
