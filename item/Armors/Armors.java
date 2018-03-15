package item.Armors;

import item.Items;

// SEARCH: 1-helmet, 2-chest, 3-legs, 4-shoes

public class Armors extends Items {
    public double improveHealth;
    public double improveDeffence;
    public double improveBlock;
    public double improveAgility;
    public double improveIntelligence;
    public double improveVitality;
    public double improveStrength;
    public double improveCrit;
    public double requireStrength;

    public Armors (String name, int id, int price, int search, double improveHealth, double improveDeffence, double improveBlock,
                   double improveAgility, double improveIntelligence, double improveVitality,
                   double improveStrength, double improveCrit, double requireStrength){
        super(name, id, price, search);

        this.improveHealth = improveHealth;
        this.improveDeffence = improveDeffence;
        this.improveBlock = improveBlock;
        this.improveAgility = improveAgility;
        this.improveIntelligence = improveIntelligence;
        this.improveVitality = improveVitality;
        this.improveStrength = improveStrength;
        this.improveCrit = improveCrit;
        this.requireStrength = requireStrength;



    }

    }
