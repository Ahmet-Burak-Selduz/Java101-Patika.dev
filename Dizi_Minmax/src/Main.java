import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = {4, 50, -12, 64, 7, -5, 28, 101};
        Arrays.sort(list);
        int nearestLittle = list[0], nearestBig = list[list.length - 1], n;
        System.out.print("Sayı Giriniz : ");
        n = input.nextInt();
        for (int i : list){
            if (i < n){
                if (i > nearestLittle){
                    nearestLittle = i;
                }
            } if (i > n) {
                if (i < nearestBig){
                    nearestBig = i;
                }
            }
        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı : " + nearestLittle);
        System.out.println("Girilen Sayıdan Büyük En Yakın Sayı : " + nearestBig);
    }
}
