package character;

public class Warrior extends Player {

    public double maxRage, rage;


    public Warrior(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense );
        this.rage = 0;
        this.maxRage = 100;
    }
}
