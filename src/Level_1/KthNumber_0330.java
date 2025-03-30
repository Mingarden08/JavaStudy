//package Level_1;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class KthNumber_0330 {
//    public static void main(String[] args) {
//        int[] array = {1, 5, 2, 6, 3, 7, 4};
//        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
//        List<Integer> temp = new ArrayList<>();
//        int[] answer = new int[commands.length];
//        for (int i = 0; i<commands.length; i++) {
//            for (int j = 0; j< array.length; j++) {
//                if (j >= commands[i][0] - 1 && j < commands[i][1]) {
//                    temp.add(array[j]);
//                    System.out.println(i + " " + j + " " + array[j]);
//                }
//                if (j == commands[i][1] || (commands[i][1] - commands[i][0] == array.length - 1 && j == commands[i][1] - 1)) {
//                    temp.sort(Comparator.naturalOrder());
//                    answer[i] = temp.get(commands[i][2] - 1);
//                    temp.clear();
//                    System.out.println(temp);
//                }
//            }
//        }
//        System.out.println(Arrays.toString(answer));
//        System.out.println(Arrays.deepToString(commands));
//    }
//}


package Level_1;

import java.util.Arrays;

public class KthNumber_0330 {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1];
            int k = commands[i][2] - 1;
            int[] subArray = Arrays.copyOfRange(array, start, end);
            Arrays.sort(subArray);
            answer[i] = subArray[k];
        }

        System.out.println(Arrays.toString(answer));
    }
}
