package Level_0;

public class RemoveVowels_0105 {
    public static void main(String[] args) {
        String m_string = "nice to meet you";
        String answer = "";
        for(int i = 0; i<m_string.length(); i++) {
            switch (m_string.charAt(i)) {
                case 'a', 'e', 'i', 'o', 'u' -> {
                    continue;
                }
                default -> {
                    answer += m_string.charAt(i);
                }
            }
        }
        System.out.println(answer);
    }
}
