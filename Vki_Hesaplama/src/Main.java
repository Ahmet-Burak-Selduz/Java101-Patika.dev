import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,vki;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = input.nextDouble();
        vki = kilo / (boy * boy);
        System.out.print("Vücut Kitle İndeksiniz : " + vki);
    }
}
