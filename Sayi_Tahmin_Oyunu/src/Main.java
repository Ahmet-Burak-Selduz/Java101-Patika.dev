import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner input = new Scanner(System.in);
        int rs = rnd.nextInt(0,100),s;
        boolean isWin = false;
        for (int i = 5; i > 0; i--){
            System.out.println("Kalan Hakkınız : " + i);
            System.out.println("-------------");
            System.out.print("0-100 Arasında Bir Sayı Girin : ");
            s = input.nextInt();
            if (s < 0 || s > 100){
                System.out.println("Hatalı Sayı Girdiniz!");
                continue;
            } else if (s == rs){
                isWin = true;
                break;
            } else {
                if (s > rs){
                    System.out.println("Daha Küçük Bir Sayı Olmalı.");
                } else {
                    System.out.println("Daha Büyük Bir Sayı Olmalı.");
                }
            }
        }
        System.out.println((isWin) ? "Tebrikler Doğru Bildiniz!" : "Malesef Bilemediniz.");
    }
}