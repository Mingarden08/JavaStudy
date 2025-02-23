package Level_0;

public class ComparingArrays_0223 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 3, 3, 3, 3};
        int[] sum = new int[2];
        int answer;
        for (int i = 0; i<arr1.length; i++) {
            sum[0] += arr1[i];
        }
        for (int i = 0; i<arr2.length; i++) {
            sum[1] += arr2[i];
        }
        if (arr1.length > arr2.length) {
            answer = 1;
        }
        else if (arr1.length < arr2.length) {
            answer = -1;
        }
        if (sum[1] == sum[0]) {
            answer = 0;
        }
        else if (sum[0] < sum[1]){
            answer = -1;
        }
        else {
            answer = 1;
        }
        System.out.println(answer);
    }
}
