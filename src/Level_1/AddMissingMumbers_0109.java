package Level_1;

public class AddMissingMumbers_0109 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,6,7,8,0};
        int answer = 45;
        for(int i = 0; i<numbers.length; i++) {
            switch (numbers[i]) {
                case 1 -> answer -= 1;
                case 2 -> answer -= 2;
                case 3 -> answer -= 3;
                case 4 -> answer -= 4;
                case 5 -> answer -= 5;
                case 6 -> answer -= 6;
                case 7 -> answer -= 7;
                case 8 -> answer -= 8;
                case 9 -> answer -= 9;
            }
        }
        System.out.println(45 - answer);
    }
}