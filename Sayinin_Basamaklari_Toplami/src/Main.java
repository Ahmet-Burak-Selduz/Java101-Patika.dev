import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi=0,basamakSayi,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        sayi = input.nextInt();
        while (sayi != 0){
            basamakSayi = sayi % 10;
            toplam += basamakSayi;
            sayi /= 10;
        }
        System.out.print("Basamakları Toplam = " + toplam);
    }
}
