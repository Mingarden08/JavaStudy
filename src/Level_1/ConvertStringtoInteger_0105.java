package Level_1;

public class ConvertStringtoInteger_0105 {
    public static void main(String[] args) {
        String s = "-1234"; int answer = 0; String str = "";
        if (s.charAt(0) == '-') {
            for (int i = 1; i<s.length(); i++) {
                str += Character.toString(s.charAt(i));
            }
            answer = Integer.valueOf(str).intValue() * -1;
        } else if (s.charAt(0) == '+') {
            for (int i = 1; i<s.length(); i++) {
                str += Character.toString(s.charAt(i));
            }
        }
        else {
            for (int i = 0; i<s.length(); i++) {
                str += Character.toString(s.charAt(i));
            }
        }
        System.out.println(answer);
        System.out.println(str);
    }
}
