package npces.monsters;

import npces.Npcs;

import java.util.Random;

public abstract class Monster extends Npcs {

    public double attack;
    public double speed;
    public double weaponDmg;

    public Monster(){};
    public Monster(boolean Agressive, double HP, String name, double attack, double speed, String description){
        super(Agressive, HP, name, description);
        this.attack = attack;
        this.speed = speed;
    }

    @Override
    public String getDescription() {
       return description;
    }

    public double Attack(){
        Random generate = new Random();
        double add = generate.nextInt(10);
        return attack + add;
    }


}
