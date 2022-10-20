package maps;

import core.Player;
import enemy.Zombie;

public class Cave extends BattleLoc {
    public Cave(Player player) {
        super(player, "Mağara", new Zombie(), "Yemek", 3);
    }
}