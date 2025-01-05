package Level_1;

public class FindRemainderIs1_0105 {
    public static void main(String[] args) {
        int n = 12; int answer = 0;
        for(int i = 1; i<=n; i++) {
            if (n%i == 1) {
                answer = i;
                break;
            }
        }
        System.out.println(answer);
    }
}
