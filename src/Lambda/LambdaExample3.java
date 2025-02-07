package Lambda;

import java.util.function.Predicate;

public class LambdaExample3 {
    public static void main(String[] args) {
        // 명시한 경우
        Predicate<Integer> isEven1 = (Integer x) -> { return x % 2 == 0; };

        // 타입과 중괄호를 생략한 경우
        Predicate<Integer> isEven2 = (x) -> x % 2 == 0;

        // 괄호까지 생략한 경우
        Predicate<Integer> isEven3 = x -> x % 2 == 0;

        System.out.println(isEven1.test(4));
        System.out.println(isEven2.test(5));
        System.out.println(isEven3.test(6));

        MyFunction f = (int a, int b) -> a > b ? a : b;
    }
}

@FunctionalInterface
interface MyFunction {
    public abstract int max(int a, int b);
}
