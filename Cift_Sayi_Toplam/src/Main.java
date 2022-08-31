import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s, say=0, toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Girin : ");
        s = input.nextInt();
        for (int i = 0; i < s; i++){
            if (i % 3 == 0 & i % 4 == 0) {
                toplam += i;
                say++;
            }
        }
        System.out.println("toplam :" + toplam);
        System.out.print("Ortalama : " + toplam / say);
    }
}
