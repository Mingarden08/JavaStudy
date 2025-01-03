package Level_1;

public class Watermelon_0102 {
    public static void main(String[] args) {
        int n = 11; String answer = "";
        for (int i = 0; i<n; i++) {
            if (i % 2 == 0)
                answer += "수";
            if (i % 2 == 1)
                answer += "박";
        }
        System.out.println(answer);
    }
}
