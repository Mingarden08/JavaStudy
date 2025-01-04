package Level_0;

import java.util.Arrays;

public class DontLikeEvenNumbers_0104 {
    public static void main(String[] args) {
        int n = 10;
        int[] answer;
        int cnt = 0;
        if (n % 2 == 0) {
            answer = new int[n / 2];
            for(int i = 1; i<n; i+=2) {
                answer[cnt++] = i;
            }
        } else {
            answer = new int[n / 2 + 1];
            for(int i = 1; i<n+1; i+=2) {
                answer[cnt++] = i;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
