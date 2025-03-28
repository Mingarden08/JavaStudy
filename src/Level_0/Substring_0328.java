package Level_0;

public class Substring_0328 {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "aabcc";
        int answer = 0;
        if (str2.indexOf(str1) != -1) {
            answer = 1;
        }
        System.out.println(answer);
    }
}
