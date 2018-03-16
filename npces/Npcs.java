package npces;

public abstract class Npcs {


    public boolean Aggresive;
    public double HP;
    public String name;
    public String description;

    //constructors
    public Npcs(boolean Aggresive, double HP, String name, String description) {
        this.Aggresive = true;
        this.HP = HP;
        this.name = name;
        this.description = description;
    }

    public Npcs() {
    }


    //methods
    public abstract String getDescription();

}