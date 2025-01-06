package Level_2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci_0106 {
    public static void main(String[] args) {
        int n = 100;
        int answer;
        List<Integer> Fibonacci = new ArrayList<>();
        Fibonacci.add(0);
        Fibonacci.add(1);
        for(int i = 0; i<n; i++) {
            Fibonacci.add((Fibonacci.get(i) + Fibonacci.get(i+1))%1234567);
        }
        answer = Fibonacci.get(n);
        System.out.println(answer);
    }
}
