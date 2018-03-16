package skills;

import character.Hunter;
import java.util.Random;

public class HunterSkills {

    static double tempVal;
    static double staminaReq;
    static double addStamina =10;

    public static double normalAttack(){
        tempVal = Hunter.attack * (Hunter.agillity * 0.2);
        System.out.println("Zaatakowałeś wręcz, zadałeś: " + Hunter.attack + " punktów obrażeń");
        if(Hunter.stamina + addStamina >= 100){
            Hunter.setStamina(100);
        }else{
            Hunter.setStamina(Hunter.stamina + addStamina);
        }
        return tempVal;

    }

    public static double FastShoot() {
        staminaReq = 45;
        if (Hunter.stamina >= 45) {
            tempVal = normalAttack() + normalAttack();
            System.out.println(" Wystrzeliłeś dwie strzały zajadjąć" + tempVal + " obrażeń.");
            Hunter.setStamina(Hunter.stamina - 45);
            return tempVal;
        } else {
            System.out.println("Poziom Twojej staminy jest zbyt niski by użyć tej umiejętności");
            return 0;
        }
    }

    public boolean Dodge() {
        Random generate = new Random();
        double b1;
        b1 = generate.nextInt(100) + 1;

        if (b1 <= Hunter.getStamina()) {
            staminaReq = 20;
            Hunter.setStamina(Hunter.getStamina() - staminaReq);
            return true;
        } else {
            return false;
        }
    }


}
