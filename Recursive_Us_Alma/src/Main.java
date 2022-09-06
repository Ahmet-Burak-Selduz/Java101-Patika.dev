import java.util.Scanner;

public class Main {
    static int usHesapla(int s, int us, int a){
        if (us == 1){
            return a;
        }
        a*=s;
        us--;
        return usHesapla(s,us,a);
    }

    public static void main(String[] args) {
        int s,us;
        Scanner input = new Scanner(System.in);
        System.out.print("Taban Sayıyı Giriniz : ");
        s = input.nextInt();
        System.out.print("Üssü Giriniz : ");
        us = input.nextInt();
        System.out.print(usHesapla(s,us,s));
    }
}
