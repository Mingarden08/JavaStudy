package Level_1;

public class GetMiddleLetter_0111 {
    public static void main(String[] args) {
        String s = "abcde";
        String answer = "";
        if (s.length()%2 == 0) {
            answer += s.charAt((s.length()/2)-1);
            answer += s.charAt(s.length()/2);
        }
        else {
            answer += s.charAt(s.length()/2);
        }
        System.out.println(answer);
    }
}
