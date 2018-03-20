package character;

import item.Armors.ArmorsList;
import item.Jewellery.JewelleryList;

import java.util.Random;

public class Hunter extends Player {

    public static double ShotDmg;
    public static double agillity;
    public static double stamina = 100;

    public Hunter(){}
    public Hunter(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg,double exp){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense,exp );
        this.agillity = 2;
        this.ShotDmg = shotDmg * agillity;
    }

    public static double getShotDmg() {
        return ShotDmg;
    }

    public static double getAgillity() {
        return agillity;
    }

    public static double getStamina() {
        return stamina;
    }

    public static void setShotDmg(double shotDmg) {
        ShotDmg = shotDmg;
    }

    public static void setAgillity(int agillity) {
        Hunter.agillity = agillity;
    }

    public static void setStamina(double stamina) {
        Hunter.stamina = stamina;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


    //Items Wearing methods
    public void setWearChest(ArmorsList chest, int index){
        super.setWearChest(chest, index);
    }
    public void setWearJewellery(JewelleryList trinket, int index){
        super.setWearJewellery(trinket, index);
        agillity = JewelleryList.JewelleryArray[index].improveAgility + agillity;
    }

}
