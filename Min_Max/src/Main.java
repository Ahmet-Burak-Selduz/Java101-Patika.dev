import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,sayi,enBuyukSayi=Integer.MIN_VALUE,enKucukSayi=Integer.MAX_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Gireceksiniz : ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++){
            System.out.print(i + ". Sayıyı Girin : ");
            sayi = input.nextInt();
            if (sayi > enBuyukSayi){
                enBuyukSayi = sayi;
            } else if (sayi < enKucukSayi){
                enKucukSayi = sayi;
            }
        }
        System.out.println("En Büyük Sayı : " + enBuyukSayi);
        System.out.println("En Küçük Sayı : " + enKucukSayi);
    }
}
