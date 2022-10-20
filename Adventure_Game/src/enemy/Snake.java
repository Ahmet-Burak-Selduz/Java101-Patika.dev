package enemy;

import java.util.Random;

public class Snake extends Obstacle {
    static Random r = new Random();
    private static int item = 0;

    public Snake() {
        super(4, "Yılan", genDamage(), 12, genAwards(), item);
    }

    public static int genDamage() {
        int damage = r.nextInt(3, 7);
        return damage;
    }

    static int genAwards() {
        int rNumber = r.nextInt(0, 101);
        if (rNumber > 85) {
            rNumber = r.nextInt(1, 101);
            if (rNumber > 80) item = 1;
            else if (rNumber > 50) item = 2;
            else item = 3;
        } else if (rNumber > 70) {
            rNumber = r.nextInt(1, 101);
            if (rNumber > 80) item = 4;
            else if (rNumber > 50) item = 5;
            else item = 6;
        } else if (rNumber > 45) {
            rNumber = r.nextInt(0, 101);
            if (rNumber > 80) return 10;
            else if (rNumber > 50) return 5;
            return 1;
        }
        return 0;
    }
}
