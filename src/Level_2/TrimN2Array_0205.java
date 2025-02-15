package Level_2;

import java.util.Arrays;

public class TrimN2Array_0205 {
    public static void main(String[] args) {
        int n = 3; long left = 2; long right = 5;
        int[] answer = new int[Long.valueOf((right - left + 1)).intValue()];
        int[][] temp = new int[n][n];
        int rows = temp.length;
        int cols = temp[0].length;
        int[] oneArray = new int[rows * cols];
        int cnt = 0;
        int answerCnt = 0;
        for (int i = 0; i<n; i++) {
            for (int j = 0; j<n; j++) {
                if (i == 0) {
                    temp[i][j] = j + 1;
                }
                else if (i >= j) {
                    temp[i][j] = i+1;
                }
                else {
                    temp[i][j] = j + 1;
                }
                oneArray[cnt++] = temp[i][j];
                if (cnt > left &&  cnt <= right+1) {
                    int oneArrayIndex = cnt -1;
                    answer[answerCnt++] = oneArray[oneArrayIndex];
                }

                if (cnt > right+1)
                    break;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
