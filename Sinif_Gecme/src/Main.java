import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,toplam=0,dersSayisi=0,ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        if (mat>=0 & mat<=100){
            toplam+= mat;
            dersSayisi++;
        }
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        if (fizik>=0 & fizik<=100){
            toplam+= fizik;
            dersSayisi++;
        }
        System.out.print("Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();
        if (turkce>=0 & turkce<=100){
            toplam+= turkce;
            dersSayisi++;
        }
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextInt();
        if (kimya>=0 & kimya<=100){
            toplam+= kimya;
            dersSayisi++;
        }
        System.out.print("Müzik notunuzu giriniz : ");
        muzik = input.nextInt();
        if (muzik>=0 & muzik<=100){
            toplam+= muzik;
            dersSayisi++;
        }
        ort = toplam / dersSayisi;
        if (ort >= 55){
            System.out.println("Tebrikler Sınıfı Başarıyla Geçtiniz!");
        } else {
            System.out.println("Malesef Sınıfı Geçemediniz.");
        }
        System.out.print("Ortalamanız : " + ort);
    }
}
