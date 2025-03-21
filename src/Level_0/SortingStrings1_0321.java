package Level_0;

import java.util.Arrays;

public class SortingStrings1_0321 {
    public static void main(String[] args) {
        String my_string = "p2o4i8gj2";
        String temp = my_string.replaceAll("[^0-9]", "");
        int[] answer = new int[temp.length()];
        for (int i = 0; i<answer.length; i++) {
            answer[i] = temp.charAt(i);
        }
        Arrays.sort(answer);
        System.out.println(temp);
    }
}
