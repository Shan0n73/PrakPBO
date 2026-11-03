package Js10Pt10.Tugas;

public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    @Override
    public void heal() {
        switch (level) {
            case 1:
                health += (int) (this.health * 0.10);
                break;
            case 2:
                health += (int) (this.health * 0.30);
                break;
            case 3:
                health += (int) (this.health * 0.40);
                break;
        }
    }

    @Override
    public void destroyed() {
        health -= health * 20 / 100;
    }

    @Override
    public String getZombieInfo() {
        return "Walking Zombie Data =\n" + "Health = " + this.health + "\n" + "Level = " + this.level;
    }
}
