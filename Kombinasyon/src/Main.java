import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, r, sayac=1, sayac2=1, sayac3=1, kombinasyon;
        Scanner input = new Scanner(System.in);
        System.out.print("n degerini girin : ");
        n = input.nextInt();
        System.out.print("r degerini girin : ");
        r = input.nextInt();
        if (n >= r) {
            for (int i = 1; i <= n; i++) {
                sayac *= i;
            }
            for (int j = 1; j <= r; j++) {
                sayac2 *= j;
            }
            for (int k = 1; k <= (n - r); k++) {
                sayac3 *= k;
            }
            kombinasyon = sayac / (sayac2 * sayac3);
            System.out.print("Sonuç : " + kombinasyon);
        } else {
            System.out.print("r değeri n'den büyük olamaz!");
        }
    }
}