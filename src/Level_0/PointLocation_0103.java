package Level_0;

public class PointLocation_0103 {
    public static void main(String[] args) {
        int[] dot = {2, 4};
        int answer = 0;
        if (dot[0] > 0 && dot[1] > 0) {
            answer = 1;
        } else if (dot[0] > 0 && dot[1] < 0) {
            answer = 4;
        }
        else if (dot[0] < 0 && dot[1] > 0) {
            answer = 2;
        }
        else  {
            answer = 3;
        }
        System.out.println(answer);
    }
}
