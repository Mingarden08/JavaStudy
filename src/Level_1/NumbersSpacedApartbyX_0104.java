package Level_1;

import java.util.Arrays;

public class NumbersSpacedApartbyX_0104 {
    public static void main(String[] args) {
        int x = 0; int n = 5;
        long[] answer = new long[n]; int cnt = 0; int minus = -1;
        if (x < 0) {
            for (long i = minus * x; i <= minus * (n * x); i += x * minus) {
                answer[cnt++] = minus * i;
            }
        }
        else if (x == 0) {
            for (long i = x; i < n; i++) {
                answer[cnt++] = x;
            }
        }
        else {
            for (long i = x; i <= n * x; i+=x) {
                answer[cnt++] = i;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
