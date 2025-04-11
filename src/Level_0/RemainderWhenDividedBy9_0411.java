package Level_0;

public class RemainderWhenDividedBy9_0411 {
    public static void main(String[] args) {
        String number = "123";
        int answer = 0;
        for (int i = 0; i<number.length(); i++) {
            answer += (int)number.charAt(i)-48;
        }
    }
}
