import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int row = 0, col = 0, s;
        Scanner input = new Scanner(System.in);
        System.out.println("\n   - - - - -      Mayın Tarlası Oyunu      - - - - -\n");
        System.out.print("1- Çok Kolay\n2- Kolay\n3- Orta\n4- Zor\n5- Çok Zor\nSeçiminiz : ");
        s = input.nextInt();
        switch (s) {
            case 1:
                row = 4;
                col = 5;
                break;
            case 3:
                row = 12;
                col = 15;
                break;
            case 4:
                row = 16;
                col = 20;
                break;
            case 5:
                row = 20;
                col = 25;
                break;
            default:
                row = 8;
                col = 10;
        }
        MineSweeper play = new MineSweeper(row, col);
        play.run();
    }
}