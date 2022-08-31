import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s,us,toplam=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı Girin : ");
        s = input.nextInt();
        System.out.print("Üssü Girin : ");
        us = input.nextInt();
        for (int i = 1; i <= us; i++){
            toplam *= s;
        }
        System.out.print("Sonuç = " + toplam);
    }
}
