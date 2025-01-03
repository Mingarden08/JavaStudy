package Level_1;

public class PrimeSum {
    public static void main(String[] args) {
        int n = 10; int answer = 0;
        for(int i = 2; i<=n; i++)
            if (isPrime(i))
                answer++;
        System.out.println(answer);
    }
    public static boolean isPrime(int i) {
        boolean flag = true;
        for(int j = 2; j<=Math.sqrt(i); j++) {
            if (i % j == 0) {
                flag = false;
                break;
            }
        }
        return flag;
    }
}