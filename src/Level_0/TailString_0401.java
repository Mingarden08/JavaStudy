package Level_0;

public class TailString_0401 {
    public static void main(String[] args) {
        String[] str_list = {"abc", "def", "ghi"};
        String ex = "ef";
        String answer = "";
        for (int i = 0; i<str_list.length; i++) {
            if (str_list[i].contains(ex)) {
                answer += "";
            }
            else {
                answer += str_list[i];
            }

        }
        System.out.println(answer);
    }
}
