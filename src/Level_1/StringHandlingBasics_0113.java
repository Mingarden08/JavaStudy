package Level_1;

public class StringHandlingBasics_0113 {
    public static void main(String[] args) {
        String s = "1234";
        boolean answer = true;
        if (s.length() == 4 || s.length() == 6) {
            for (int i = 0; i<s.length(); i++) {
                if (s.charAt(i) >= 65 || 122 <= s.charAt(i)) {
                    answer = false;
                }
            }
        }
        else {
            answer = false;
        }
        System.out.println(answer);
    }
}
