import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kullaniciAdi,parola;
        int girisHakki=3,islem,bakiye=500,miktar;
        Scanner input = new Scanner(System.in);
        while (girisHakki > 0){
            System.out.print("Kullanıcı Adınız : ");
            kullaniciAdi = input.nextLine();
            System.out.print("Parolanız : ");
            parola = input.nextLine();
            if (kullaniciAdi.equals("patika") & parola.equals("dev123")){
                System.out.println("Merhaba Sayın " + kullaniciAdi + " XYZ Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("1- Para Yatırma\n2- Para Çekme\n3- Bakiye Sorgulama\n4- Çıkış Yap");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçin : ");
                    islem = input.nextInt();
                    switch (islem){
                        case 1 :
                            System.out.print("Para Miktarı : ");
                            miktar = input.nextInt();
                            bakiye += miktar;
                            break;
                        case 2 :
                            System.out.print("Para Miktarı : ");
                            miktar = input.nextInt();
                            if (miktar <= bakiye){
                                bakiye -= miktar;
                            } else {
                                System.out.println("Yetersiz Bakiye!");
                            }
                            break;
                        case 3 :
                            System.out.println(bakiye);
                            break;
                    }
                } while (islem!=4);
                System.out.print("İyi Günler Dileriz :)");
                break;
            } else {
                girisHakki--;
                if (girisHakki == 0){
                    System.out.print("Hesabınız Bloke Olmuştur. Lütfen Bankayla İletişime Geçiniz.");
                } else {
                    System.out.println("Yanlış Kullanıcı Adı veya Şifre !");
                    System.out.println("Kalan Hakkınız : " + girisHakki);
                }
            }
        }
    }
}
