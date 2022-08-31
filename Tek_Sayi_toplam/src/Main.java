import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s=0,toplam=0;
        Scanner input = new Scanner(System.in);
        while (s % 2 == 0){
            System.out.print("Sayı girin : ");
            s = input.nextInt();
            if (s % 4 == 0){
                toplam += s;
            }
        }
        System.out.print("Toplam = "+ toplam);
    }
}
