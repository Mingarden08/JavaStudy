package Lambda;

import java.util.function.BiFunction;

public class LambdaExample1 {
    public static void main(String[] args) {
        // 타입 명시한 경우
        BiFunction<Integer, Integer, Integer> add1 = (Integer x, Integer y) -> x + y;

        // 타입을 생략한 경우
        BiFunction<Integer, Integer, Integer> add2 = (x, y) -> x + y;
        // Integer Integer Integer 타입으로 x, y가 Integer 타입이므로 추론 가능

        System.out.println(add1.apply(5, 3));
        System.out.println(add2.apply(5, 3));
    }
}
