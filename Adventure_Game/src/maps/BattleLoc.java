package maps;

import core.Player;
import enemy.Obstacle;
import enemy.Snake;
import tools.*;

import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;
    private Random r = new Random();


    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;
    }

    @Override
    public boolean onLocation() {
        int obsNumber = r.nextInt(1, this.getMaxObstacle() + 1);
        System.out.println("# # Şuan " + this.getName() + "'a Girdiniz # #");
        System.out.println("Dikkatli Ol Burada " + obsNumber + " tane " + this.getObstacle().getName() + " Yaşıyor !");
        System.out.print("1- Savaş\n2- Ayrıl\n? : ");
        int selectCase = input.nextInt();
        System.out.println("\n");
        if (selectCase == 1) {
            System.out.println(" - - - - Savaş Başladı! - - - -");
            playerStats();
            if (combat(obsNumber)) {
                System.out.println(getName() + " İçinde Bulunan Tüm Düşmanları Yendiniz.");
                addAwardToPlayer();
                return true;
            }
        }
        if (getPlayer().getHealth() <= 0) {
            System.out.println("Öldün.");
            return false;
        }
        System.out.println("\n");
        return true;
    }

    public void addAwardToPlayer() {
        for (int i = 0; i < getPlayer().getInventory().getAwards().length; i++) {
            if (getPlayer().getInventory().getAwards()[i] == "") {
                getPlayer().getInventory().setAwards(i, this.getAward());
                break;
            }
        }
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            if (getObstacle().getId() == 4) setObstacle(new Snake());
            getObstacle().setHealth(getObstacle().getOrijinalHealth());
            enemyStats(i);
            while (getPlayer().getHealth() > 0 && getObstacle().getHealth() > 0) {
                System.out.println();
                System.out.print("1- Vur\t 2- Kaç\n? : ");
                int selectCombat = input.nextInt();
                System.out.println();
                if (selectCombat == 1) {
                    int obstacleDamage = getObstacle().getDamage() - getPlayer().getInventory().getArmor().getBlock();
                    if (obstacleDamage < 0) obstacleDamage = 0;
                    int rs = r.nextInt(0, 2);
                    if (rs == 0) {
                        System.out.println(" + Canavar Sana Vurdu -> -" + obstacleDamage);
                        getPlayer().setHealth(getPlayer().getHealth() - obstacleDamage);
                        if (getPlayer().getHealth() > 0) {
                            System.out.println(" + Sen Vurdun -> +" + getPlayer().getTotalDamage());
                            getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getTotalDamage());
                        }
                    } else {
                        System.out.println(" + Sen Vurdun -> +" + getPlayer().getTotalDamage());
                        getObstacle().setHealth(getObstacle().getHealth() - getPlayer().getTotalDamage());
                        if (getObstacle().getHealth() > 0) {
                            System.out.println(" + Canavar Sana Vurdu -> -" + obstacleDamage);
                            getPlayer().setHealth(getPlayer().getHealth() - obstacleDamage);
                        }
                    }
                    System.out.println();
                    afterHit();
                } else {
                    return false;
                }
            }
            if (getObstacle().getHealth() < getPlayer().getHealth()) {
                System.out.println("Düşmanı Yendiniz!");
                if (getObstacle().getAward() > 0) {
                    System.out.println("+" + getObstacle().getAward() + " Coin Kazandınız.");
                    getPlayer().setMoney(getPlayer().getMoney() + getObstacle().getAward());
                } else if (getObstacle().getItem() > 0) {
                    switch (getObstacle().getItem()) {
                        case 1:
                            System.out.println("Tüfek Kazandınız.");
                            getPlayer().getInventory().setWeapon(new Rifle());
                            break;
                        case 2:
                            System.out.println("Kılıç Kazandınız.");
                            getPlayer().getInventory().setWeapon(new Sword());
                            break;
                        case 3:
                            System.out.println("Tabanca Kazandınız.");
                            getPlayer().getInventory().setWeapon(new Gun());
                            break;
                        case 4:
                            System.out.println("Ağır Zırh Kazandınız.");
                            getPlayer().getInventory().setArmor(new HeavyArmor());
                            break;
                        case 5:
                            System.out.println("Orta Zırh Kazandınız.");
                            getPlayer().getInventory().setArmor(new MediumArmor());
                            break;
                        case 6:
                            System.out.println("Hafif Zırh Kazandınız.");
                            getPlayer().getInventory().setArmor(new LightArmor());
                            break;
                    }
                } else {
                    System.out.println("Hiçbir Şey Kazanamadınız.");
                }
                System.out.println();
            } else {
                return false;
            }
        }
        return true;
    }

    public void afterHit() {
        System.out.print("Canın : " + getPlayer().getHealth());
        System.out.println("\t Düşmanın Canı : " + getObstacle().getHealth());
    }

    public void playerStats() {
        System.out.println("Oyuncu Değerleri ;");
        this.getPlayer().printInfo();
    }

    public void enemyStats(int i) {
        System.out.println(i + ". Düşman Değerleri ;");
        System.out.print("Sağlık : " + getObstacle().getHealth() + "\t Hasar : " + getObstacle().getDamage() + "\t Ödül : ");
        if (getObstacle().getAward() == 0) System.out.println("?");
        else System.out.println(getObstacle().getAward());
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
