package maps;

import core.Player;
import tools.Armor;
import tools.Weapon;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("# # Mağazaya Hoşgeldiniz # #");
        System.out.println("1- Silahlar\n2- Zırhlar\n3- Çıkış");
        System.out.print("Seçiminiz : ");
        int selectCase = input.nextInt();
        while (selectCase < 1 || selectCase > 3) {
            System.out.println("Hatalı Değer Girdiniz, Tekrar Deneyiniz !");
            selectCase = input.nextInt();
        }
        switch (selectCase) {
            case 1:
                printWeapon();
                buyWeapon();
                break;
            case 2:
                printArmor();
                buyArmor();
                break;
            case 3:
                System.out.println("Yine Bekleriz :)");
                System.out.println("\n");
                return true;
        }
        System.out.println("\n");
        return true;
    }

    public void printWeapon() {
        System.out.println(" +  +  +  +  Silahlar  +  +  +  +");
        for (Weapon weapon : Weapon.weapons()) {
            System.out.println(weapon.getId() + "- " + weapon.getName() + "\t < Hasar = " + weapon.getDamage() + " Ücret = " + weapon.getPrice() + " >");
        }
        System.out.println((Weapon.weapons().length + 1) + "- Geri");
    }

    public void buyWeapon() {
        System.out.print("Seçiminiz : ");
        int selectWeaponId = input.nextInt();
        while (selectWeaponId < 1 || selectWeaponId > Weapon.weapons().length + 1) {
            System.out.println("Hatalı Değer Girdiniz, Tekrar Deneyiniz !");
            selectWeaponId = input.nextInt();
        }
        if (selectWeaponId != Weapon.weapons().length + 1) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponId);
            if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                System.out.println(" - - Yeterli Paranız Bulunmamaktadır ! - -");
            } else {
                int balance = this.getPlayer().getMoney() - selectedWeapon.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println(" - - Silah Başarıyla Satın Alındı - -");
                this.getPlayer().getInventory().setWeapon(selectedWeapon);
            }
        }
    }

    public void printArmor() {
        System.out.println(" +  +  +  +  Zırhlar  +  +  +  +");
        for (Armor armor : Armor.armors()) {
            System.out.println(armor.getId() + "- " + armor.getName() + "\t < Zırh = " + armor.getBlock() + " Ücret = " + armor.getPrice() + " >");
        }
        System.out.println((Armor.armors().length + 1) + "- Geri");
    }

    public void buyArmor() {
        System.out.print("Seçiminiz : ");
        int selectArmorId = input.nextInt();
        while (selectArmorId < 1 || selectArmorId > Armor.armors().length + 1) {
            System.out.println("Hatalı Değer Girdiniz, Tekrar Deneyiniz !");
            selectArmorId = input.nextInt();
        }
        if (selectArmorId != Armor.armors().length + 1) {
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);
            if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                System.out.println(" - - Yeterli Paranız Bulunmamaktadır ! - -");
            } else {
                int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                this.getPlayer().setMoney(balance);
                System.out.println(" - - Zırh Başarıyla Satın Alındı - -");
                this.getPlayer().getInventory().setArmor(selectedArmor);
            }
        }
    }
}
