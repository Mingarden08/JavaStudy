package Level_1;

public class DetermineIntegerSquareRoot_0107 {
    public static void main(String[] args) {
        long n = 121; long answer = 0;
        double temp = Math.sqrt(n)+1;
        if (Math.sqrt(n) % 1 == 0) {
            answer = (long)Math.pow(temp, 2);
        }
        else {
            answer = -1;
        }
        System.out.println(answer);
    }
}
