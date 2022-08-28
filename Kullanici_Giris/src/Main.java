import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullanici,sifre,tercih,yeniSifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Kulanıcı Adınızı Giriniz : ");
        kullanici = input.nextLine();
        System.out.print("Şifrenizi Giriniz : ");
        sifre = input.nextLine();
        if (kullanici.equals("patika") && sifre.equals("java123")){ //Bilgiler doğru ise yapılacaklar.
            System.out.println("Başarıyla Giriş Yapıldı.");
        } else if (kullanici.equals("patika")){//Şifre Yanlış ise yapılacaklar.
            System.out.println("Şifrenizi sıfırlamak istiyorsanız 1'e istemiyorsanız 0'a basın.");
            tercih = input.nextLine();
            if (tercih.equals("1")) {
                System.out.print("Yeni Şifrenizi Girin : ");
                yeniSifre = input.nextLine();
                System.out.print((yeniSifre.equals("java123")) ? "Şifre oluşturulamadı, lütfen başka şifre giriniz.!" : "Şifre oluşturuldu");
            }
        } else {//Bilgiler yanlış ise yapılacaklar.
            System.out.print("Hatalı Kullanıcı Adı veya Şifre!");
        }
    }
}
