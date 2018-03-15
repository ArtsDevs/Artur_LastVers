package character;

import java.util.Random;

public class Hunter extends Player {

    public double ShotDmg;
    public int agillity;
    public double stamina = 100;

    public Hunter(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense );
        this.agillity = 2;
        this.ShotDmg = shotDmg * agillity;
    }


    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
