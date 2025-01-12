package Level_1;

import java.util.*;

public class ArrangeStringsInDescendingOrder_0112 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefgHijklmnopqrstuvwxyz";
        String answer = "";
        List<Character> temp = new ArrayList<>();
        for (int i = s.length()-1; i>=0; i--) {
            temp.add(s.charAt(i));
        }
        temp.sort(Comparator.reverseOrder());
        for (int i = 0; i<temp.size(); i++) {
            answer += temp.get(i);
        }
        System.out.println(temp);
    }
}
