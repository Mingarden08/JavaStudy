package Level_0;

public class FindInteger_0405 {
    public static void main(String[] args) {
        int[] num_list = {15, 98, 23, 2, 15};
        int n = 20;
        int answer = 0;
        for(int i = 0; i<num_list.length; i++) {
            if (num_list[i] == n) {
                answer = 1;
            }
        }
    }
}
