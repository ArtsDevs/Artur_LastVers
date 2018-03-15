package character;

public class Mage extends Player{

    public static double maxMana, currentMana;
    public static double magicPower; //

    public Mage(){}
    public Mage(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense );
        this.maxMana= 70;
        this.currentMana = 70;
        this.magicPower = (intelligence + knowlage) / 2; //this.magicPower = (intelligence + knowlage) / 2; //

    }

    public static double getCurrentMana() {
        return currentMana;
    }

    public static double getMaxMana() {
        return maxMana;
    }

    public static double getMagicPower() {
        return magicPower;
    }

    public static void setMaxMana(double maxMana) {
        Mage.maxMana = maxMana;
    }

    public static void setCurrentMana(double currentMana) {
        Mage.currentMana = currentMana;
    }

    public static void setMagicPower(double magicPower) {
        Mage.magicPower = magicPower;
    }
}
