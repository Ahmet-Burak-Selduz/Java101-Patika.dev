import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1,s2,islem;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin : ");
        s1 = input.nextInt();
        System.out.print("İkinci Sayıyı Girin : ");
        s2 = input.nextInt();
        System.out.print("Yapmak İstediğiniz İşlemi Seçin ;\n1- Toplama\n2- Çıkarma\n3- Çarpma\n4- Bölme\n");
        islem = input.nextInt();
        switch (islem){
            case 1 : System.out.print(s1+s2);break;
            case 2 : System.out.print(s1-s2);break;
            case 3 : System.out.print(s1*s2);break;
            case 4 : System.out.print((s2 != 0) ? s1/s2 : "Sayı Sıfıra Bölünemez!");break;
            default: System.out.print("Hatalı İşlem Seçimi!");
        }
    }
}
