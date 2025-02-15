package Level_0;

public class AntArmy_0212 {
    public static void main(String[] args) {
        int hp = 23;
        int answer = 0; int temp = 0;
        answer += hp/5;
        hp -= answer * 5;
        temp += answer;
        answer = 0;
        answer += hp/3;
        hp -= answer * 3;
        temp += answer;
        answer = 0;
        answer += hp/1;
        hp -= answer * 1;
        temp += answer;
        answer = 0;
        System.out.println(temp);
    }
}
