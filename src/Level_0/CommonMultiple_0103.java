package Level_0;

public class CommonMultiple_0103 {
    public static void main(String[] args) {
        int number = 60, n = 2, m = 3, answer = 0;
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        else {
            answer = 0;
        }
        System.out.println(answer);
    }
}
