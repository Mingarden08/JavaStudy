package Level_0;

public class ConcatenatedNumber_0208 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int answer = 0;
        String even = "";
        String odd = "";
        for (int i = 0; i<num_list.length; i++) {
            if (num_list[i] % 2 == 0) {
                even += num_list[i];
            }
            else {
                odd += num_list[i];
            }
        }
        answer += Integer.parseInt(even) + Integer.parseInt(odd);
        System.out.println(answer);
    }
}
