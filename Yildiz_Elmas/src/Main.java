import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        int s = input.nextInt();
        for (int i = 1; i <= s; i++){
            for (int j = 1; j <= s - i; j++){
                System.out.print(" ");
            } for (int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = s - 1; i > 0; i--){
            for (int j = 1; j <= s - i; j++){
                System.out.print(" ");
            } for (int k = 1; k <= i * 2 - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
