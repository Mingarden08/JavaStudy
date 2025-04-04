package Level_0;

public class CreatingAnArray1_0403 {
    public static void main(String[] args) {
        int n = 15;
        int k = 5;
        int cnt = 0;
        int[] answer = new int[n/k];
        for (int i = 1; i<=n; i++) {
            if (i%k == 0) {
                System.out.println(i);
                answer[cnt++] = i;
            }
        }
    }
}
