package Java;

public class SumOfDivisors_0101 {
    public static void main(String[] args) {
        int answer = 0;
        int n = 12;
        for(int i = 1; i<n+1; i++) {
            if(n%i == 0) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
