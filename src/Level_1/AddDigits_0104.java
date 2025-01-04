package Level_1;

import java.util.*;
public class AddDigits_0104 {
    public static void main(String[] args) {
        int answer = 0; int n = 123;
        String numbers = Integer.toString(n);
        for(int i = 0; i<numbers.length(); i++) {
            answer += (int)numbers.charAt(i)-48;
        }
        System.out.println(answer);
    }
}
