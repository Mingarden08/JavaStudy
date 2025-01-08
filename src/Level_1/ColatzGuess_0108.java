package Level_1;

public class ColatzGuess_0108 {
    public static void main(String[] args) {
        long num = 1;
        int answer = 0;
        if (num == 1) {
            answer = 0;
            System.out.println(answer);
        }
        while (num != 1 || answer == 500) {
            if (num % 2 == 0) {
                num = num/2;
                answer++;
            }
            else if (num % 2 == 1) {
                num = (num*3) + 1;
                answer++;
            }
        }
        if (answer >= 500) {
            answer = -1;
        }
        System.out.println(answer);
    }
}
