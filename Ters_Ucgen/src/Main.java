import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Sayısını Girin : ");
        int s = input.nextInt();
        for (int i = s; i > 0; i--){
            for (int j = 1; j <= ((s * 2 - 1) - (i * 2 - 1)) / 2; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
