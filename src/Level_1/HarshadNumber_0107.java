package Level_1;

public class HarshadNumber_0107 {
    public static void main(String[] args) {
        int x = 13;
        int temp = x;
        boolean answer = true;
        int sum = 0;
        while(temp > 0) {
            sum += temp%10;
            temp /= 10;
        }
        System.out.println(sum);
        System.out.println(x);
        System.out.println(x%sum);
        if (x % sum == 0) {
            answer = true;
        }
        else {
            answer = false;
        }
        System.out.println(answer);
    }
}
