import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, s;
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin Boyutu N : ");
        n = input.nextInt();
        int[] list =  new int[n];
        System.out.println("Dizinin Elemanlarını Giriniz :");
        for (int i = 0; i < list.length; i++){
            System.out.print((i + 1) + ". Elemanı : ");
            s = input.nextInt();
            list[i] = s;
        }
        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int value : list){
            System.out.print(value + " ");
        }
    }
}