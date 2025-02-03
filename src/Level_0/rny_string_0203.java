package Level_0;

public class rny_string_0203 {
    public static void main(String[] args) {
        String rny_string = "my_string";
        String answer = "";
        for (int i = 0; i<rny_string.length(); i++) {
            if (rny_string.charAt(i) == 'm') {
                answer += "rn";
            }
            else {
                answer += rny_string.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
