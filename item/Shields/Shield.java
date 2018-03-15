package item.Shields;

import item.Items;

public class Shield extends Items{
    public double improveDeffence;
    public double improveBlock;
    public double improveAgility;
    public double improveIntelligence;

    public double improveStrength;
    public double requireStrength;

public Shield (String name, int id, int price, int search, double improveDeffence, double improveBlock, double improveAgility,
               double improveIntelligence, double improveStrength, double requireStrength){
        super(name, id, price, search);
        this.improveDeffence = improveDeffence;
        this.improveAgility = improveAgility;
        this.improveBlock = improveBlock;
        this.improveIntelligence = improveIntelligence;
        this.improveStrength = improveStrength;
        this.requireStrength = requireStrength;


}


}
