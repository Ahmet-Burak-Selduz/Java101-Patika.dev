import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mesafe,tutar,indirimOrani;
        int yas, yolcuTipi;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe km türünden giriniz : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yas = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
        yolcuTipi = input.nextInt();
        if (mesafe > 0 & yas > 0 & (yolcuTipi == 1 | yolcuTipi == 2)) {
            if (yas < 12) {
                indirimOrani = 0.50;
            } else if (yas < 24) {
                indirimOrani = 0.10;
            } else if (yas > 65) {
                indirimOrani = 0.30;
            } else {
                indirimOrani = 0;
            }
            indirimOrani = (mesafe * 0.10) * indirimOrani;
            tutar = (mesafe * 0.10 - indirimOrani) * yolcuTipi;
            if (yolcuTipi == 2) {
                indirimOrani = tutar * 0.20;
                tutar = tutar - indirimOrani;
            }
            System.out.print("Toplam tutar : " + tutar);
        } else {
            System.out.print("Hatalı Veri Girdiniz!");
        }
    }
}
