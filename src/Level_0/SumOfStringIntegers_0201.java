package Level_0;

public class SumOfStringIntegers_0201 {
    public static void main(String[] args) {
        String num_str = "123456789";
        int answer = 0;
        for (int i = 0; i<num_str.length(); i++) {
            answer += (int)(num_str.charAt(i)) - 48;
        }
        System.out.println(answer);
    }
}
