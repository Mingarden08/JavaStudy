package Level_0;

public class RockPaperScissors_0121 {
    public static void main(String[] args) {
        String rsp = "205";
        String answer = "";
        for (int i = 0; i<rsp.length(); i++) {
            switch (rsp.charAt(i)) {
                case '0' -> answer += "5";
                case '2' -> answer += "0";
                case '5' -> answer += "2";
            }
        }
        System.out.println(answer);
    }
}
