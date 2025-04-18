package Level_0;

public class CompareTheOperationValuesOfTwoNumbers_0418 {
    public static void main(String[] args) {
        int a = 2, b = 91;
        System.out.println(a * b * 2 <= Integer.parseInt(Integer.toString(a)+Integer.toString(b)) ? Integer.parseInt(Integer.toString(a)+Integer.toString(b)) : a * b * 2);
    }
}
