package item.Jewellery;

import item.Items;
//SEARCH: 1-naszyjnik, 2-pierścień, 3-kolczyki, 4-bransoletka
public class Jewellery extends Items{

        public double improveHealth;
        public double improveMana;
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


        public Jewellery(String name, int id, int price, int search, double improveHealth, double improveMana,
                        double improveSpeedAttack, double improveDeffence, double improveAttack, double improveBlock,
                        double improveAgility, double improveIntelligence, double improveVitality, double improveStrength,
                        double improveCrit, double requireStrength){
            super(name, id, price, search);

            this.improveHealth = improveHealth;
            this.improveMana = improveMana;
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

