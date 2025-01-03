package Level_0;

public class NumberOfOrderedPairs_0103 {
    public static void main(String[] args) {
        int n = 1000000; int answer = 0;
        for(int i = 1; i<=n; i++) {
            for(int j = 1; j<=Math.sqrt(n); j++) {
                if (i*j == n) {
                    answer++;
                }
            }
        }
        if(Math.sqrt(n) % 1 == 0)
            answer = (answer-1)*2 + 1;
        else
            answer = answer*2;
        System.out.println(answer);
    }
}
