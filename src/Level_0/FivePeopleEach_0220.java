package Level_0;

import java.util.Arrays;

public class FivePeopleEach_0220 {
    public static void main(String[] args) {
        String[] names = {"nami", "ahri", "jayce", "garen", "ivern", "vex", "jinx"};
        String[] answer = new String[(names.length + 4) / 5];
        int cnt = 0;
        for (int i = 0; i<names.length; i += 5) {
            answer[cnt++] = names[i];
        }
        System.out.println(Arrays.toString(answer));
    }
}
