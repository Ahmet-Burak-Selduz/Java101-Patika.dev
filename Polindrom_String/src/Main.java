import java.util.Scanner;

public class Main {
    static boolean isPolindrom(String letter){
        String reverse = "";
        for (int i = letter.length() - 1; i >= 0; i--){
            reverse += letter.charAt(i);
        }
        return reverse.equals(letter);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Kelime Girin : ");
        String letter = input.nextLine();
        System.out.print(isPolindrom(letter));
    }
}