package Level_0;

public class AdditionOfHiddenNumbers1_0124 {
    public static void main(String[] args) {
        String my_string = "aAb1B2cC34oOp";
        int answer = 0;
        for(int i = 0; i<my_string.length(); i++) {
            if (((int)my_string.charAt(i)) - 48 >= 1 && ((int)my_string.charAt(i)) - 48 <= 9)
                answer += ((int)my_string.charAt(i)) - 48;
        }
        System.out.println(answer);

    }
}
