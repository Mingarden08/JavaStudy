package Level_1;

public class FindPandYinString_0105 {
    public static void main(String[] args) {
        String s = "Pyy";
        boolean answer = true;
        int cntP = 0; int cntY = 0;
        for(int i = 0; i<s.length(); i++) {
            if (Character.toUpperCase(s.charAt(i)) == 'P') {
                cntP++;
            }
            else if (Character.toUpperCase(s.charAt(i)) == 'Y') {
                cntY++;
            }
        }
        if (!(cntP == cntY)) {
            answer = false;
        }
        System.out.println(answer);
    }
}
