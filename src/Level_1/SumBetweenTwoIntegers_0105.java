package Level_1;

public class SumBetweenTwoIntegers_0105 {
    public static void main(String[] args) {
        int a = 3; int b = 5; long answer = 0;
        if (a<b) {
            for (int i = a; i<=b; i++) {
                answer += i;
            }
        } else if (a == b) {
            answer = a;
        }
        else {
            for (int i = b; i<=a; i++) {
                answer += i;
            }
        }
        System.out.println(answer);
    }
}
