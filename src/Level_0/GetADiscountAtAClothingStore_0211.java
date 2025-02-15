package Level_0;

public class GetADiscountAtAClothingStore_0211 {
    public static void main(String[] args) {
        int price = 100010;
        int answer = 0;
        double temp = price;
        if (price >= 100000 && price < 300000)
            temp = temp - (temp * 0.05);
        else if (price >= 300000 && price < 500000)
            temp = temp - (temp * 0.10);
        else if (price >= 500000)
            temp = temp - (temp * 0.20);
        answer = (int)Math.floor(temp);
        System.out.println(answer);
    }
}
