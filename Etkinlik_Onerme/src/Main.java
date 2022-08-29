import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sicaklik;
        Scanner input = new Scanner(System.in);
        System.out.print("Sıcaklık Girin : ");
        sicaklik = input.nextInt();
        if (sicaklik<5){
            System.out.print("Kayak yapmanızı öneririz.");
        } else if (sicaklik < 15) {
            System.out.print("Sinemaya gitmenizi öneririz.");
        } else if (sicaklik < 25) {
            System.out.print("Piknik yapmanızı öneririz.");
        } else {
            System.out.print("Yüzmenizi öneririz.");
        }
    }
}
