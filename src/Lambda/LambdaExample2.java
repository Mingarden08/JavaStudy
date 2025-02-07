package Lambda;

import java.util.function.Consumer;

public class LambdaExample2 {
    public static void main(String[] args) {
        // 명시한 경우
        Consumer<String> print1 = (String message) -> System.out.println(message);

        // 생략한 경우
        Consumer<String> print2 = (message) -> System.out.println(message);
        // Consumer<String> 이므로 message String 타입이란 걸 추론할 수 있다

        print1.accept("Hello");
        print2.accept("Hello");
    }
}