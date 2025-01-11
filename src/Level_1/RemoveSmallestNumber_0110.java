package Level_1;

import java.util.*;

public class RemoveSmallestNumber_0110 {
    public static void main(String[] args){
        int[] arr = {4,3,2,1};
        if (arr.length == 1) {
            int[] answer = {-1};
            System.out.println(answer);
        }
        int[] answer = new int[arr.length-1];
        List<Integer> temp = new ArrayList<>();
        int min = arr[0];
        for (int i = 0; i<arr.length; i++) {
            if(min >= arr[i])
                min = arr[i];
        }
        for(int i = 0; i<arr.length; i++){
            if (min == arr[i])
                continue;
            else
                temp.add(arr[i]);
        }
        for(int i = 0; i<temp.size(); i++) {
            answer[i] = temp.get(i);
        }
        System.out.println(answer);
    }
}
