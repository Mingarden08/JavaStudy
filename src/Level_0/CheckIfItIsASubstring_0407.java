package Level_0;

public class CheckIfItIsASubstring_0407 {
    public static void main(String[] args) {
        String my_string = "banana";
        String target = "ana";
        int answer = 0;
        if (my_string.contains(target)) answer = 1;
        System.out.println(answer);
    }
}
