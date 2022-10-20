package core;

import tools.Armor;
import tools.Punch;
import tools.Rag;
import tools.Weapon;

public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private String[] awards;

    public Inventory() {
        this.weapon = new Punch();
        this.armor = new Rag();
        this.awards = new String[3];
        for (int i = 0; i < this.awards.length; i++) awards[i] = "";
    }

    public void printAwards() {
        System.out.print("Toplanan Ödüller : ");
        for (String award : getAwards()) {
            System.out.print(award + "\t");
        }
        System.out.println();
    }

    public boolean isAward(String awardName) {
        for (String award : getAwards()) {
            if (award == awardName) return true;
        }
        return false;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String[] getAwards() {
        return awards;
    }

    public void setAwards(int n, String awards) {
        this.awards[n] = awards;
    }
}
