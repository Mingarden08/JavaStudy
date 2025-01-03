package Level_0;

import java.util.Arrays;

public class MakeTriangle_0103 {
    public static void main(String[] args) {
        int answer = 0; int[] sides = {199, 72, 222};
        Arrays.sort(sides);
        if (sides[0] + sides[1] <= sides[2]) {
            answer = 2;
        }
        else {
            answer = 1;
        }
        System.out.println(answer);
    }
}
