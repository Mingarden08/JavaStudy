package Level_0;

public class ChangeSpecificCharactersToUppercase_0215 {
    public static void main(String[] args) {
        String my_string = "programmers";
        String alp = "p";
        String answer = "";
        for (int i = 0; i<my_string.length(); i++) {
            String temp = my_string.charAt(i) + "";
            if (my_string.charAt(i) == alp.charAt(0)) {
                answer += temp.toUpperCase();
            }
            else {
                answer += temp;
            }
        }
        System.out.println(answer);
    }
}
