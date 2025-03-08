package Level_0;

public class ManipulatingNumbers1_0308 {
    public static void main(String[] args) {
        int n = 0;
        String control = "wsdawsdassw";
        for (int i = 0; i<control.length(); i++) {
            switch (control.charAt(i)) {
                case 'w' -> n++;
                case 's' -> n--;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
            }
        }
        System.out.println(n);
    }
}
