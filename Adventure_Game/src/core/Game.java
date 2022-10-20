package core;

import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void start() {
        System.out.print("Macera Oyununa Hoşgeldiniz.\nLütfen Bir İsim Giriniz : ");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın " + playerName + " Adaya Hoşgeldiniz !");
        System.out.println("Karakterinizi Seçin :");
        player.selectChar();
        System.out.println();
        while (true) {
            player.printInfo();
            player.getInventory().printAwards();
            if (!player.selectLoc()) break;
        }
    }
}
