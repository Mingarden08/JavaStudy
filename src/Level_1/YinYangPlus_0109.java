package Level_1;

public class YinYangPlus_0109 {
    public static void main(String[] args) {
        int[] absolutes = {4,7,12};
        boolean[] signs = {true, false, true};
        int answer = 0;
        for(int i = 0; i<absolutes.length; i++) {
            if (signs[i]) {
                answer += absolutes[i];
            }
            else {
                answer -= absolutes[i];
            }
        }
        System.out.println(answer);
    }
}
