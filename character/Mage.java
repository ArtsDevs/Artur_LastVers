package character;

public class Mage extends Player{

    public double maxMana, currentMana;
    public double magicPower; //

    public Mage(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense );
        this.maxMana= 70;
        this.currentMana = 70;
        this.magicPower = (intelligence + knowlage) / 2; //this.magicPower = (intelligence + knowlage) / 2; //

    }



}
