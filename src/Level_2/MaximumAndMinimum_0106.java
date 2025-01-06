package Level_2;

import java.util.*;

public class MaximumAndMinimum_0106 {
    public static void main(String[] args) {
        String s = "-1 -2 2 -3 5 -4 0 2 9 10 20 -94";
        String answer = "";
        List<Integer> answerList = new ArrayList<>();
        String[] str = s.split(" ");
        for(int i = 0; i<str.length; i++) {
            answerList.add(Integer.parseInt(str[i]));
        }
        Collections.sort(answerList);
        System.out.println(answerList.get(0) + " " + answerList.get(answerList.size()-1));
    }
}
