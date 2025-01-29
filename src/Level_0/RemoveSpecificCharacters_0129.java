package Level_0;

public class RemoveSpecificCharacters_0129 {
    public static void main(String[] args) {
        String my_string = "abcdef";
        String letter = "f";
        char alpha = letter.charAt(0);
        String answer = "";
        for (int i = 0; i<my_string.length(); i++) {
            if (my_string.charAt(i) == alpha)
                continue;
            else
                answer += my_string.charAt(i);
        }
        System.out.println(answer);
    }
}
