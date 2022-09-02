import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1,s2,ebob=0,ekok=0,i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("1. Sayıyı Girin : ");
        s1 = input.nextInt();
        System.out.print("2. Sayıyı Girin : ");
        s2 = input.nextInt();
        while (i != s1){
            if (s1 % i == 0 & s2 % i == 0){
                ebob = i;
            }
            i++;
        }
        i = s1;
        while (i <= s1 * s2){
            if (i % s1 == 0 & i % s2 == 0){
                ekok = i;
                break;
            }
            i += s1;
        }
        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}
