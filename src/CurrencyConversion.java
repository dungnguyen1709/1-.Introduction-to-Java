import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.printf(" Enter a USD ");
        usd = sc.nextDouble();
        double exchange = usd * 23000;
        System.out.printf(" Giá trị VNĐ : " + exchange);

    }
}
