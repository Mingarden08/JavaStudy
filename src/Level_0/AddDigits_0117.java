package Level_0;

public class AddDigits_0117 {
    public static void main(String[] args) {
        int n = 1234;
        int answer = 0;
        String str = n + "";
        for(int i = 0; i<(int)(Math.log10(n))+1; i++) {
            answer += (int)str.charAt(i) - 48;
        }
        System.out.println(answer);
    }
}
