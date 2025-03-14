package Level_0;

public class DiceGame1_0314 {
    public static void main(String[] args) {
        int a = 2; int b = 4;
        int answer = 0;
        if (a % 2 == 1 & b % 2 == 1) {
            answer += (a*a) + (b*b);
        }
        else if (a % 2 == 1 | b % 2 == 1) {
            answer += 2 * (a + b);
        }
        else {
            answer += a - b;
            System.out.println(Math.abs(answer));
        }
        System.out.println(answer);
    }
}