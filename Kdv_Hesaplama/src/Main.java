import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ürün Fiyatını Girin : ");
        int price = input.nextInt();
        float taxedPrice = (price > 1000) ? price * 1.08f : price * 1.18f;
        float tax = taxedPrice - price;
        System.out.println("KDV'li Fiyat : " + taxedPrice);
        System.out.print("KDV Tutarı : " + tax);
    }
}
