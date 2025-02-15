package Level_0;

import java.util.Arrays;

public class PerformDifferentOperationsDependingOnTheLengthOfTheArray_0214 {
    public static void main(String[] args) {
        int[] arr = {49, 12, 100, 276, 33};
        int n = 27;
        int[] answer = arr;
        if (arr.length % 2 == 0) {
            for (int i = 1; i<arr.length; i+=2) {
                answer[i] += n;
            }
        }
        else {
            for (int i = 0; i<arr.length; i+=2) {
                answer[i] += n;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
