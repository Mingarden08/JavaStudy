package Level_0;

public class ProductAndSumOfElements_0317 {
    public static void main(String[] args) {
        int[] num_list = {3, 4, 5, 2, 1};
        int temp1 = 0;
        int temp2 = 1;
        for (int i = 0; i<num_list.length; i++) {
            temp1 += num_list[i];
            temp2 *= num_list[i];
            System.out.println(temp1 + "\n" + temp2);

        }
        System.out.println((int)Math.pow(temp1, 2) + "\n" + temp2);
    }
}
