package Level_0;

public class FindNumbers_0323 {
    public static void main(String[] args) {
        int num = 232443;
        int k = 4;
        int answer = -1;
        String temp = String.valueOf(num);
        for (int i = 0; i<temp.length(); i++) {
            if (temp.charAt(i) == k + '0') {
                answer = i + 1;
                break;
            }
        }


        System.out.println(answer);
    }
}
