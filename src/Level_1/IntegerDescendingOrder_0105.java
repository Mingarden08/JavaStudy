package Level_1;

import java.util.*;

public class IntegerDescendingOrder_0105 {
    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;
        List<Integer> tempArr = new ArrayList<>();
        String tempAnswer = n + "";
        for(int i = (int)Math.log10(n); i>=0; i--) {
            tempArr.add((int)tempAnswer.charAt(i) - 48);
        }
        tempArr.sort(Comparator.reverseOrder());
        tempAnswer = "";
        for(int i = 0; i<tempArr.size(); i++) {
            tempAnswer += tempArr.get(i);
        }
        answer = Long.parseLong(tempAnswer);
        System.out.println(answer);
    }
}
