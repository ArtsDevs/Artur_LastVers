package character;

import item.Armors.ArmorsList;
import item.Jewellery.Jewellery;
import item.Jewellery.JewelleryList;
import item.Items;

public abstract class Player {
    public static String name;
    public static double maxHp, currentHp;
    public static double strength, intelligence, speed, knowlage;
    public static double attack, defense;
    public static Items[] wear = new Items[6];

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

//Items Wearing Methods

    public void setWearChest(ArmorsList chest, int index){
        int i = index;
        if(strength >= ArmorsList.ArmorsArray[i].requireStrength) {

            wear[3] = ArmorsList.ArmorsArray[i];
            maxHp = ArmorsList.ArmorsArray[i].improveHealth + maxHp;
            defense = ArmorsList.ArmorsArray[i].improveDeffence + defense;
            intelligence = ArmorsList.ArmorsArray[i].improveIntelligence + intelligence;
            strength = ArmorsList.ArmorsArray[i].improveStrength + strength;
        }else{
            System.out.println("Masz za mało siły aby ubrać ten przedmiot");
        }
    }

    public void setWearJewellery(JewelleryList trinket, int index){
        int i = index;
        wear[3] = JewelleryList.JewelleryArray[0];
        maxHp = JewelleryList.JewelleryArray[i].improveHealth + maxHp;
        defense = JewelleryList.JewelleryArray[i].improveDeffence + defense;
        attack = JewelleryList.JewelleryArray[i].improveAttack + attack;
        intelligence = JewelleryList.JewelleryArray[i].improveIntelligence + intelligence;
        strength = JewelleryList.JewelleryArray[i].improveStrength + strength;
    }

}
