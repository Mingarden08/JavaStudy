package Level_1;

public class FindAverage_0104 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        double answer = 0;
        for(int i = 0; i<arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer/arr.length);
    }
}
