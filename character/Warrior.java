package character;

public class Warrior extends Player {

    public static double maxRage, rage;

    public Warrior(){}
    public Warrior(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense );
        this.rage = 0;
        this.maxRage = 100;
    }


    public static double getMaxRage() {
        return maxRage;
    }

    public static double getRage() {
        return rage;
    }

    public static void setMaxRage(double maxRage) {
        Warrior.maxRage = maxRage;
    }

    public static void setRage(double rage) {
        Warrior.rage = rage;
    }
}
