import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        s = input.nextInt();
        for (int i = 1; i < s; i++){
            if (s % i == 0){
               toplam += i;
            }
        }
        System.out.print((toplam == s) ? s + " Mükemmel Sayıdır." : s + " Mükemmel Sayı Değildir !");
    }
}
