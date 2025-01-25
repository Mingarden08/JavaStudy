package Level_0;

public class UppercaseAndLowercaseLetters_0125 {
    public static void main(String[] args) {
        String my_string = "abCdEfghIJ";
        String answer = "";
        for (int i = 0; i<my_string.length(); i++) {
            if (Character.isUpperCase(my_string.charAt(i)))
                answer += Character.toLowerCase(my_string.charAt(i));
            else
                answer += Character.toUpperCase(my_string.charAt(i));
        }
        System.out.println(answer);
    }
}
