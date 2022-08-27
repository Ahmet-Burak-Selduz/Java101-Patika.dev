import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a,b,c,u,cevre,alan;
        System.out.print("Üçgenin 1. Kenarını Girin : ");
        a = input.nextInt();
        System.out.print("Üçgenin 2. Kenarını Girin : ");
        b = input.nextInt();
        c = Math.sqrt((a*a)+(b*b)); // hipotenüs hesaplanması.
        cevre = a+b+c;
        u = cevre / 2;
        alan = Math.sqrt(u * (u-a) * (u-b) * (u-c)); // alanın hesaplanması.
        System.out.println("Hipotenüs : " + c);
        System.out.println("Üçgenin alanı: " + alan);
    }
}
