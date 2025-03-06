package Level_0;

public class NCharactersAtTheEndOfAString_0306 {
    public static void main(String[] args) {
        String my_string = "ProgrammerS123";
        int n = 11;
        String answer = "";
        for (int i = my_string.length() - n; i<my_string.length(); i++) {
            answer += my_string.charAt(i);
        }
        System.out.println(answer);
    }
}
