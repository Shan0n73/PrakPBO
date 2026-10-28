package Uts;
public class PatrolRobot extends Robot {
    public Battery battery;

    public PatrolRobot() {
        this.Name = "Patrol01" + Name;

    }

    public PatrolRobot(String name, int cpuSpeed, int power, Battery battery) {
        this.Name = "Patrol01" + name;
        this.CPUSpeed = cpuSpeed;
        this.Power = power;
        this.battery = battery;
    }
    @Override 
    public void increasePower() {
        this.Power += 10;
    }
}