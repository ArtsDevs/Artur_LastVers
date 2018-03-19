package item.Weapons;

import item.Items;

//search: BRONIE: 1-Miecze, 2-Sztylety, 3-Topory, tasaki, 4,5,6,7,8,9,10 (można dodać)
//INNE: 11 - Wachlarze, 12 - MagiczneLaski, 13- Łuki, 14,15,16,..

public class Weapons extends Items {

    public double improveSpeedAttack;
    public double improveDeffence;
    public double improveAttack;
    public double improveBlock;
    public double improveAgility;
    public double improveIntelligence;
    public double improveVitality;
    public double improveStrength;
    public double improveCrit;
    public double requireStrength;

    public Weapons(String name, int id, int price, int search, double improveSpeedAttack, double improveDeffence,
                   double improveAttack, double improveBlock, double improveAgility, double improveIntelligence,
                   double improveVitality, double improveStrength, double improveCrit,double requireStrength){
        super(name, id, price, search);

        this.improveSpeedAttack = improveSpeedAttack;
        this.improveDeffence = improveDeffence;
        this.improveAttack = improveAttack;
        this.improveBlock = improveBlock;
        this.improveAgility = improveAgility;
        this.improveIntelligence = improveIntelligence;
        this.improveVitality = improveVitality;
        this.improveStrength = improveStrength;
        this.improveCrit = improveCrit;
        this.requireStrength = requireStrength;

    }
}
