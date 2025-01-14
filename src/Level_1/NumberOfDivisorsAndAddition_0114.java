package Level_1;

import java.util.ArrayList;
import java.util.List;

public class NumberOfDivisorsAndAddition_0114 {
    public static void main(String[] args) {
        int left = 13; int right = 17;
        int answer = 0;
        int start = left;
        List<Integer> count = new ArrayList<>();
        for(int i = 0; i<=right-left; i++) {
            count.add(findDivisor(start++));
        }
        for(int i = 0; i<count.size(); i++) {
            answer += count.get(i) % 2 == 0 ? left++ : left++ * -1;
        }
    }
    public static int findDivisor(int start) {
        int cnt = 0;
        for(int i = 1; i<=start; i++) {
            if (start % i == 0) {
                cnt++;
            }
        }
        return cnt;
    }
}
