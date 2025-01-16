package Level_0;

public class SharingPizza3_0116 {
    public static void main(String[] args) {
        int slice = 7; int n = 10;
        int answer = 0;
        int cnt = 1;
        while (true) {
            if (slice * cnt >= n) {
                break;
            }
            else {
                cnt++;
            }
        }
        answer = cnt;
        System.out.println(answer);
    }
}
