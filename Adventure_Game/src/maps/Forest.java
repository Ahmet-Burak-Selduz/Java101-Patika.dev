package maps;

import core.Player;
import enemy.Vampire;

public class Forest extends BattleLoc {
    public Forest(Player player) {
        super(player, "Orman", new Vampire(), "Odun", 2);
    }
}
