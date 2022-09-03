import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s,a=0,b=1,c;
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısını Girin : ");
        s = input.nextInt();
        for (int i = 1; i < s; i++){
            c = a + b;
            System.out.println(a + " + " + b + " = " + c);
            a = b;
            b = c;
        }
    }
}
