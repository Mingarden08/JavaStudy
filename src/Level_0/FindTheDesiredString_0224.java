package Level_0;

public class FindTheDesiredString_0224 {
    public static void main(String[] args) {
        String myString = "aBcdEfG";
        String pat = "abc";
        int answer = (myString.toLowerCase()).contains(pat.toLowerCase()) ? 1 : 0;
        System.out.println(answer);
    }
}
