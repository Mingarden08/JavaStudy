package Level_0;

public class SharingPizza1_0129 {
    public static void main(String[] args) {
        int n = 15;
        int answer = (int)(n/7) == 0 ? n/7 : (n/7) + 1;
        System.out.println(answer);
    }
}
