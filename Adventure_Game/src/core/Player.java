package core;

import characters.Archer;
import characters.GameChar;
import characters.Knight;
import characters.Samurai;
import maps.*;

import java.util.Scanner;

public class Player {
    private int damage;
    private int health;
    private int money;
    private String charName;
    private String name;
    private Inventory inventory;
    private int orijinalHealth;
    private final Scanner input = new Scanner(System.in);

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        for (GameChar gameChar : charList) {
            System.out.println("ID : " + gameChar.getId() + "\t Karakter : " + gameChar.getName() + "\t Hasar : " + gameChar.getDamage() + "\t Sağlık : " + gameChar.getHealth() + "\t Para : " + gameChar.getMoney());
        }
        System.out.print("Seçiminiz : ");
        int selectChar = input.nextInt();
        while (selectChar < 1 || selectChar > charList.length) {
            System.out.println("Hatalı Değer Girdiniz, Tekrar Deneyin !");
            selectChar = input.nextInt();
        }
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
        }
    }

    public void printInfo() {
        System.out.println("Silah : " + this.getInventory().getWeapon().getName() + "\t Zırh : " + this.getInventory().getArmor().getName() + "\t Hasar : " + getTotalDamage() + "\t Bloklama : " + this.getInventory().getArmor().getBlock() + "\t Sağlık : " + getHealth() + "\t Para : " + getMoney());
    }

    public void initPlayer(GameChar gameChar) {
        this.setDamage(gameChar.getDamage());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());
        this.setCharName(gameChar.getName());
        this.setOrijinalHealth(gameChar.getHealth());
    }

    public boolean selectLoc() {
        Location location = null;
        System.out.print("\nBölgeler :\n1 - Güvenli Ev\n2 - Dükkan\n3 - Maden\n4 - Mağara");
        if (getInventory().isAward("Yemek")) System.out.print(" --> Birisi Burayı Yıkmış !");
        System.out.print("\n5 - Orman");
        if (getInventory().isAward("Odun")) System.out.print(" --> Birisi Buradaki Odunları Kesmiş !");
        System.out.print("\n6 - Nehir");
        if (getInventory().isAward("Su")) System.out.print(" --> Birisi Buradaki Suyu Kurutmuş !");
        System.out.println("\n7 - Çıkış Yap");
        System.out.print("Gitmek İstediğiniz Bölgeyi Seçin : ");
        int selectLoc = input.nextInt();
        System.out.println("- - - - - - - - - -");
        switch (selectLoc) {
            case 2:
                location = new ToolStore(this);
                break;
            case 3:
                location = new Mine(this);
                break;
            case 4:
                if (!getInventory().isAward("Yemek")) location = new Cave(this);
                else {
                    System.out.println("\nBu Mekan Tamamlanmıştır !\n");
                    location = new SafeHouse(this);
                }
                break;
            case 5:
                if (!getInventory().isAward("Odun")) location = new Forest(this);
                else {
                    System.out.println("\nBu Mekan Tamamlanmıştır !\n");
                    location = new SafeHouse(this);
                }
                break;
            case 6:
                if (!getInventory().isAward("Su")) location = new River(this);
                else {
                    System.out.println("\nBu Mekan Tamamlanmıştır !\n");
                    location = new SafeHouse(this);
                }
                break;
            case 7:
                System.out.println("Geri Dönmeyi Unutma !");
                return false;
            default:
                location = new SafeHouse(this);
                break;
        }
        return location.onLocation();
    }

    public boolean isCollectAllAwards() {
        for (String award : getInventory().getAwards()) {
            if (award == "") return false;
        }
        return true;
    }

    public int getTotalDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) health = 0;
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOrijinalHealth() {
        return orijinalHealth;
    }

    public void setOrijinalHealth(int orijinalHealth) {
        this.orijinalHealth = orijinalHealth;
    }
}
