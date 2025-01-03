package Level_1;

public class NumericStringsAndEnglish_0102 {
    public static void main(String[] args) {
        String s = "2three45sixseven";
        String answer = "";
        for(int i = 0; i<s.length(); i++) {
            char tempChar = s.charAt(i);
            switch (tempChar) {
                case 'z' -> {
                    i += 3; answer += "0";
                }
                case 'o' -> {
                    i += 2; answer += "1";
                }
                case 't' -> {
                    if (s.charAt(i+1) == 'w') {
                        i += 2; answer += "2";
                    }
                    else {
                        i += 4; answer += "3";
                    }
                }
                case 'f' -> {
                    if (s.charAt(i+1) == 'o') {
                        i += 3; answer += "4";
                    }
                    else {
                        i += 3; answer += "5";
                    }
                }
                case 's' -> {
                    if (s.charAt(i+1) == 'i') {
                        i += 2; answer += "6";
                    }
                    else {
                        i += 4; answer += "7";
                    }
                }
                case 'e' -> {
                    i += 4; answer += "8";
                }
                case 'n' -> {
                    i += 3; answer += "9";
                }
                default -> answer += tempChar;
            };
        }
        System.out.println(Integer.parseInt(answer));
    }
}
