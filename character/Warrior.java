package character;

import item.Armors.ArmorsList;
import item.Jewellery.JewelleryList;

public class Warrior extends Player {

    public static double maxRage, rage;

    public Warrior(){}
    public Warrior(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg,double exp){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense,exp );
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
    //Items Wearing methods
    public void setWearChest(ArmorsList chest, int index){
        super.setWearChest(chest, index);
    }
    public void setWearJewellery(JewelleryList trinket, int index){
        super.setWearJewellery(trinket, index);

    }
}
