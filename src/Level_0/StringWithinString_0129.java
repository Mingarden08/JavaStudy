package Level_0;

public class StringWithinString_0129 {
    public static void main(String[] args) {
        String str1 = "ab6CDE443fgh22iJKlmn1o";
        String str2 = "6CD";
        int answer = str1.indexOf(str2) != -1 ? 1 : 2;
        System.out.println(answer);
    }
}
