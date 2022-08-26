import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Girin : ");
        mat = input.nextInt();
        System.out.print("Fizik Notunuzu Girin : ");
        fizik = input.nextInt();
        System.out.print("Kimya Notunuzu Girin : ");
        kimya = input.nextInt();
        System.out.print("Türkçe Notunuzu Girin : ");
        turkce = input.nextInt();
        System.out.print("Tarih Notunuzu Girin : ");
        tarih = input.nextInt();
        System.out.print("Müzik Notunuzu Girin : ");
        muzik = input.nextInt();
        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6.0;
        String sonuc = (ort > 60) ? "Geçti" : "Kaldı";
        System.out.println("Not Ortalamanız : " + ort);
        System.out.print("Durum : " + sonuc);
    }
}
