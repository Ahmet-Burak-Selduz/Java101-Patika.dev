import java.util.Scanner;

public class Main {
    static int pattern(int n, boolean k, int tempN){
        System.out.print(n + " ");
        if (n <= 0) {
            k = false;
        }
        if (k){
            return pattern(n - 5, k, tempN);
        } else {
            if (tempN == n){
                return n;
            }
            return pattern(n + 5, k, tempN);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("N Sayısı : ");
        int n = input.nextInt();
        pattern(n,true, n);
    }
}
