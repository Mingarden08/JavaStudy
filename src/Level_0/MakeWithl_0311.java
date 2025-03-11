package Level_0;

public class MakeWithl_0311 {
    public static void main(String[] args) {
        String myString = "jjnnllkkmm";
        String answer = "";
        for (int i = 0; i<myString.length(); i++) {
            switch (myString.charAt(i)) {
                case 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k' -> answer += 'l';
                default -> answer += myString.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
