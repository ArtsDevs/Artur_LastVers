package npces.monsters.Bosses;

import npces.monsters.Monster;

public abstract class Gods extends Monster {

    public double resistance;
    public double stamina;

//constructors
    public Gods(){}
    public Gods(boolean Agressive, double HP, String name, double attack, double speed, double resistance, double stamina, String description){
        super(Agressive, HP, name, attack,speed, description);
        this.resistance = resistance;
        this.stamina = 100;
    }

//methods
    public abstract boolean Skill();
    public abstract String BossInfo();
}
