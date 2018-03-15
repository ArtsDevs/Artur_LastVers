package npces.neutrals;

import npces.Npcs;

public abstract class Neutrals extends Npcs{

    public double money;

//constuctors
    public Neutrals(boolean Aggresive, double HP, String name, double money, String description){
        super(Aggresive, HP, name, description);
        this.money = money;
    }
    public Neutrals(){};

//methods
    public abstract double getMoney();
    public abstract void setMoney(double money);
    public abstract Object getItems(int i);
    public abstract double Attack();


}
