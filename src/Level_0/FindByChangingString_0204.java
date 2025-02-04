package Level_0;

public class FindByChangingString_0204 {
    public static void main(String[] args) {
        String myString = "ABBAA";
        String pat = "AABB";
        String temp = "";
        for (int i = 0; i<myString.length(); i++) {
            if (myString.charAt(i) == 'A')
                temp += "B";
            else
                temp += "A";
        }
        int answer = temp.contains(pat) ? 1 : 0;
        System.out.println(answer);
    }
}
