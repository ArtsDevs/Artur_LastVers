package skills;

import character.Mage;

public class MageSkills {

    static double skillDamage = Mage.magicPower + Mage.attack;
    static double requiredMana;
    static double normalAttack = Mage.attack;
    static boolean isPyroEnhanced;
    static boolean isFrosted;
    static String defaultString = "Użyłeś magii: ";


    public static double normalAttack(){
        System.out.println("Zaatakowałeś wręcz, zadałeś: " + normalAttack + " punktów obrażeń");
        return normalAttack;
    }

    public static double fireBall(){
        requiredMana = 20;
        skillDamage = skillDamage * 175/100;
        Mage.setCurrentMana(Mage.getCurrentMana() - requiredMana);
        String name = "Kula ognia";
        System.out.println(defaultString + name + " zadałeś: " + skillDamage + " punktów obrażeń");
        if (isPyroEnhanced){
            skillDamage *= 2;
            isPyroEnhanced = false;
        }
        return skillDamage;
    }

    public static double frostBall(){
        requiredMana = 40;
        skillDamage = skillDamage * 210/100;
        isFrosted = true;
        Mage.setCurrentMana(Mage.getCurrentMana() - requiredMana);
        String name = "Kula mrozu";
        System.out.println(defaultString + name + " zadałeś: " + skillDamage + " punktów obrażeń");
        return skillDamage;
    }

    public static double iceLance(){
        skillDamage = skillDamage * 89.3/100;
        if(isFrosted)
            skillDamage = skillDamage * 3;
        requiredMana = 40;
        Mage.setCurrentMana(Mage.getCurrentMana() - requiredMana);
        String name = "Lodowa lanca";
        System.out.println(defaultString + name + " zadałeś: " + skillDamage + " punktów obrażeń");
        return skillDamage;
    }

    public static double pyroBlast(){
        skillDamage += skillDamage*0.2 + skillDamage;
        requiredMana = 40;
        Mage.setCurrentMana(Mage.getCurrentMana() - requiredMana);
        String name = "Wybuch ognia";
        System.out.println(defaultString + name + " zadałeś: " + skillDamage + " punktów obrażeń");
        if (isPyroEnhanced){
            skillDamage *= 2;
            isPyroEnhanced = false;
        }
        return skillDamage;
    }

    public static void enhancedPyrotechnics(){
        requiredMana = 30;
        Mage.setCurrentMana(Mage.getCurrentMana() - requiredMana);
        isPyroEnhanced = true;
    }
}
