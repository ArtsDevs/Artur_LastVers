package character;

import item.Armors.ArmorsList;
import item.Jewellery.JewelleryList;

public class Mage extends Player{

    public static double maxMana, currentMana;
    public static double magicPower; //

    public Mage(){}
    public Mage(String name, double maxHp, double currentHp, double strength, double intelligence, double speed, double knowlage, double attack, double defense, double shotDmg,double exp){
        super(name, maxHp,currentHp, strength, intelligence, speed,knowlage, attack, defense,exp );
        this.maxMana= 70;
        this.currentMana = 70;
        this.magicPower = (intelligence + knowlage) / 2; //this.magicPower = (intelligence + knowlage) / 2; //

    }

    //Getters
    public static double getCurrentMana() {
        return currentMana;
    }

    public static double getMaxMana() {
        return maxMana;
    }

    public static double getMagicPower() {
        return magicPower;
    }

    // Setters
    public static void setMaxMana(double maxMana) {
        Mage.maxMana = maxMana;
    }

    public static void setCurrentMana(double currentMana) {
        Mage.currentMana = currentMana;
    }

    public static void setMagicPower(double magicPower) {Mage.magicPower = magicPower;}


    //Items Wearing methods
    public void setWearChest(ArmorsList chest, int index){
        super.setWearChest(chest, index);
    }
    public void setWearJewellery(JewelleryList trinket, int index){
        super.setWearJewellery(trinket, index);
        maxMana = JewelleryList.JewelleryArray[index].improveMana + maxMana;
    }

}
