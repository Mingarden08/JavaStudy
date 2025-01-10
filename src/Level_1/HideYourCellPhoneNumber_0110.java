package Level_1;

public class HideYourCellPhoneNumber_0110 {
    public static void main(String[] args) {
        String phone_number = "01033334444";
        String answer = "";
        for(int i = 0; i<phone_number.length(); i++) {
            if (i+4 < phone_number.length()) {
                answer += "*";
            }
            else{
                answer += phone_number.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
