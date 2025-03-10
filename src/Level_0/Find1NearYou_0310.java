package Level_0;

public class Find1NearYou_0310 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0};
        int idx = 3;
        int answer = -1;
        for (int i = 0; i<arr.length; i++) {
            if (arr[i] == 1 & idx <= i) {
                System.out.println(i);
            }
        }
        System.out.println(answer);
    }
}
