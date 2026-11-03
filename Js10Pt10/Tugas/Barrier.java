package Js10Pt10.Tugas;

public class Barrier implements Destroyable {

    private int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void destroy() {
        destroyed();
    }

    @Override
    public void destroyed() {
    strength -= (int) Math.ceil(strength * 0.10);
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + this.strength + "\n";
    }
}
