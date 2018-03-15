package character;

public abstract class Player {
    public static String name;
    public static double maxHp, currentHp;
    public static double strength, intelligence, speed, knowlage;
    public static double attack, defense;

    public Player(){};
    public Player(String name, double maxHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double currentHp){
        this.name = name;
        this.maxHp = maxHp;
        this.strength = strength;
        this.intelligence = intelligence;
        this.speed = speed;
        this.knowlage = knowlage;
        this.attack = attack + (0.2* strength);
        this.defense = defense;
        this.currentHp = maxHp;
    }

}
