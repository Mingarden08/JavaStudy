package Level_0;

import java.util.Arrays;

public class ConvertingStringCaseInAnArray_0225 {
    public static void main(String[] args) {
        String[] strArr = {"AAA","BBB","CCC","DDD"};
        String[] answer = new String[strArr.length];
        for (int i = 0 ; i<strArr.length; i++) {
            if (i%2 == 0) {
                answer[i] = strArr[i].toLowerCase();
            }
            else {
                answer[i] = strArr[i].toUpperCase();
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
