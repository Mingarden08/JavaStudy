package Level_0;

public class ConvertingASequenceToFitACondition3_0315 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 3;
        int[] answer = new int[arr.length];
        if (k % 2 == 0) {
            for(int i = 0; i<arr.length; i++) {
                answer[i] += arr[i] + k;
            }
        }
        else {
            for(int i = 0; i<arr.length; i++) {
                answer[i] += arr[i] * k;
            }
        }
    }
}
