package Level_0;

import java.util.Arrays;

public class CutArray_0104 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; int num1 = 2; int num2 = 3;
        int[] answer = new int[num2 - num1+1];
        for(int i = 0; i < answer.length; i++) {
//            System.out.println(numbers.length);
//            System.out.println(Arrays.toString(answer));
//            System.out.println(num1+i);
            answer[i] = numbers[num1+i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
