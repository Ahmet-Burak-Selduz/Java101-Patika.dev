import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int sayi=input.nextInt();

        System.out.print( sayi+ " sayısından küçük dördün kuvvetleri: ");
        for (int i=4; i<=sayi; i*=4){
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");
        System.out.print( sayi+ " sayısından küçük beşin kuvvetleri: ");
        for (int i=5; i<=sayi; i*=5){
            System.out.print(i + ", ");
        }
        System.out.println("\b\b");
    }
}
