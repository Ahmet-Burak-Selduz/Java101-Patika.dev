import java .util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean artikYilmi;
        Scanner input = new Scanner(System.in);
        System.out.print("Yıl Giriniz : ");
        int yil = input.nextInt();
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                artikYilmi = (yil % 400 == 0) ? true : false;
            } else {
                artikYilmi = true;
            }
        } else {
            artikYilmi = false;
        }
        System.out.print((artikYilmi==true) ? yil+" bir artık yıldır !": yil+" bir artık yıl değildir !");
    }
}
