package TestClass;

import character.Hunter;
import character.Player;
import npces.monsters.Bosses.Anubis;
import npces.monsters.Bosses.Gods;
import npces.neutrals.Trademan;

public class MainClass {

    public static void main(String args[]){

            Hunter janek = new Hunter("janek", 10,10,10,10,10,10,10,10,10,0);
        Hunter.getAttackTest();
        Hunter.EXP(1001);
        Hunter.getAttackTest();
    }
}
