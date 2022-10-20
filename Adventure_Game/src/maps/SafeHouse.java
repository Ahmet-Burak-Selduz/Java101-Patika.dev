package maps;

import core.Player;

public class SafeHouse extends NormalLoc {
    public SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    @Override
    public boolean onLocation() {
        System.out.println("# # Güvenli Evdesiniz # #");
        System.out.println(" - - Canınız Fullendi - -");
        System.out.println("\n");
        getPlayer().setHealth(getPlayer().getOrijinalHealth());
        if (getPlayer().isCollectAllAwards()) {
            System.out.println(" -   -   -   -   -  TEBRİKLER OYUNU KAZANDINIZ  -   -   -   -   -");
            return false;
        }
        return true;
    }
}
