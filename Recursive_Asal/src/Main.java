import java.util.Scanner;

public class Main {
    static boolean Asalmi(int s, int i){
        if (i == s){
            return true;
        }
        if (s % i == 0) {
            return false;
        }
        i++;
        return Asalmi(s,i);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı girin : ");
        int s = input.nextInt();
        System.out.print((Asalmi(s,2)) ? s + " Sayısı Asaldır." : s + " Sayısı Asal Değildir!");
    }
}
