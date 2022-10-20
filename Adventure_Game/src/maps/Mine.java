package maps;

import core.Player;
import enemy.Snake;

public class Mine extends BattleLoc {
    public Mine(Player player) {
        super(player, "Maden", new Snake(), "", 5);
    }

}
