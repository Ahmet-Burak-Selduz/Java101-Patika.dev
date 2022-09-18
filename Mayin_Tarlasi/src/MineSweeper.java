import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int mapRow;
    int mapCol;
    int mineCount;
    int flatCount = 0;
    Character[][] userMap;
    boolean[][] mineMap;
    boolean[][] visitedMap;
    boolean[][] needsToChecked;
    int playerRow;
    int playerCol;
    int playerFlat;
    char safeZone = '-';
    char flat = 31;

    MineSweeper(int row, int col) {
        this.mapRow = row;
        this.mapCol = col;
        mineCount = row * col / 6;
        createAllMap();
        createMineMap();
    }

    void createAllMap(){
        userMap = new Character[mapRow][mapCol];
        mineMap = new boolean[mapRow][mapCol];
        visitedMap = new boolean[mapRow][mapCol];
        needsToChecked = new boolean[mapRow][mapCol];
    	for (int i = 0; i < mapRow; i++) {
            for (int j = 0; j < mapCol; j++) {
                userMap[i][j] = safeZone;
                mineMap[i][j] = false;
                visitedMap[i][j] = false;
                needsToChecked[i][j] = false;
            }
        }
    }

    void createMineMap() {
        Random rnd = new Random();
        int loc, i = 0;
        int[] mapLoc = new int[mineCount];
        while (++i < mineCount) {
            loc = rnd.nextInt(0, (mapRow * mapCol - 1));
            if (!isMineProduct(mapLoc, loc)) {
                mapLoc[i] = loc;
                mineMap[loc % mapRow][loc / mapCol] = true;
            }
        }
    }

    void run(){
        Scanner input = new Scanner(System.in);
        while (true) {
            addSpace("* ");
            System.out.println("\n\n");
            if (isWin()) {
                System.out.println("\n\n Tebrikler Kazandınız !");
                break;
            }
            printGame(false);
            System.out.print("Bayrak Sayısı : " + (mineCount - flatCount));
            System.out.print("\nBayrak (bırakmak için 1'e basın) : ");
            playerFlat = input.nextInt();
            System.out.print("Satır Girin : ");
            playerRow = input.nextInt() - 1;
            System.out.print("Sütun Girin : ");
            playerCol = input.nextInt() - 1;
            if (playerRow < 0 || playerRow >= mapRow || playerCol < 0 || playerCol >= mapCol) {
                System.out.println("Hatalı Ölçü Girdiniz !!!");
                continue;
            }
            if (playerFlat == 1 && (userMap[playerRow][playerCol] == safeZone || userMap[playerRow][playerCol] == flat)){
                addFlat();
                continue;
            }
            if (mineMap[playerRow][playerCol]) {
                System.out.println("\n\n");
                addSpace(" ");
                System.out.println("BOOM !\n");
                printGame(true);
                System.out.println("\n");
                addSpace(" ");
                System.out.println("Game Over.");
                break;
            } else {
                if (showArea(playerRow, playerCol) == 0) {
                    check();
                }
            }
        }
    }

    void addFlat(){
        if (flatCount == mineCount){
            if (userMap[playerRow][playerCol] == safeZone)
                System.out.println("Daha Fazla Bayrak Ekleyemezsiniz !");
            else {
                userMap[playerRow][playerCol] = safeZone;
                flatCount--;
            }
        } else {
            if (userMap[playerRow][playerCol] == flat){
                userMap[playerRow][playerCol] = safeZone;
                flatCount--;
            }
            else{
                userMap[playerRow][playerCol] = flat;
                flatCount++;
            }
        }
    }

    int showArea(int a, int b){
        int copyMinA = a - 1;
        int copyMinB = b - 1;
        int copyMaxA = a + 1;
        int copyMaxB = b + 1;
        int mineCount = 0;
        if (a <= 0)
            copyMinA = 0;
        else if (a + 2 > mapRow)
            copyMaxA = a;
        if (b <= 0)
            copyMinB = 0;
        else if (b + 2 > mapCol)
            copyMaxB = b;
        for (int i = copyMinA; i <= copyMaxA; i++) {
            for (int j = copyMinB; j <= copyMaxB; j++) {
                if (mineMap[i][j])
                    mineCount++;
            }
        }
        if (mineCount == 0) {
            for (int i = copyMinA; i <= copyMaxA; i++) {
                for (int j = copyMinB; j <= copyMaxB; j++) {
                    if (i == a && j == b)
                        continue;
                    needsToChecked[i][j] = true;
                }
            }
        }
        userMap[a][b] = (char) (mineCount + '0');
        visitedMap[a][b] = true;
        return mineCount;
    }

    void check(){
        for (int i = 0; i < mapRow; i++) {
            for (int j = 0; j < mapCol; j++) {
                if (needsToChecked[i][j] && !visitedMap[i][j])
                    showArea(i, j);
                for (int i2 = 0; i2 < i; i2++){
                    for (int j2 = 0; j2 < j; j2++){
                        if (needsToChecked[i2][j2] && !visitedMap[i2][j2])
                            check();
                    }
                }
            }
        }
    }

    void printGame(boolean isLost) {
        System.out.print("     ");
        for (int i = 1; i <= mapCol; i++) {
            if (i < 10)
                System.out.print(i + "   ");
            else
                System.out.print(i + "  ");
        }
        System.out.println("\n");
        for (int i = 0; i < mapRow; i++) {
            if (i < 9)
                System.out.print((i + 1) + "    ");
            else
                System.out.print((i + 1) + "   ");
            for (int j = 0; j < mapCol; j++) {
                if (isLost && mineMap[i][j])
                    userMap[i][j] = 'X';
                System.out.print(userMap[i][j]);
                System.out.print("   ");
            }
            System.out.println();
        }
        System.out.println();
    }

    boolean isWin(){
        int safeCount = 0;
        for (Character[] i : userMap){
            for (Character j : i){
                if (j == safeZone || j == flat)
                    safeCount++;
            }
        }
        if (safeCount - mineCount == 0)
            return true;
        return false;
    }

    boolean isMineProduct(int[] mineLoc, int value) {
        for (int i : mineLoc) {
            if (i == value)
                return true;
        }
        return false;
    }

    void addSpace(String c){
        for (int i = 0; i < mapCol * 2; i++){
            System.out.print(c);
        }
    }
}