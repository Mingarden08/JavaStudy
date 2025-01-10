package Level_1;

import java.util.*;

public class RemoveSmallestNumber_0110 {
    public static void main(String[] args){
        int[] arr = {2, 3, 1};
        int min = arr[0];
        if (arr.length <= 1) {
            int[] answer = new int[arr.length];
            answer[0] = -1;
            System.out.println(answer[0]);
        }
        int[] answer = new int[arr.length-1];
        for (int i = 0; i<arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        for(int i = 0; i<arr.length; i++) {
            if (min == arr[i]) {
                continue;
            }
            else {
                answer[i] = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(Arrays.toString(answer));
    }
}
