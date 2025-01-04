package Level_0;

import java.util.*;
public class ChangeTheCasetoPrint_0104 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String answer = "";
        String a = sc.next();
        for(int i = 0; i<a.length(); i++) {
            if(!(Character.isLowerCase(a.charAt(i)))) {
                answer += Character.toLowerCase(a.charAt(i));
            }
            else {
                answer += Character.toUpperCase(a.charAt(i));
            }
        }
        System.out.println(answer);
    }
}
