package TestClass;

import npces.monsters.Bosses.Anubis;
import npces.monsters.Bosses.Gods;
import npces.neutrals.Trademan;

public class MainClass {

    public static void main(String args[]){

        Anubis anubis = new Anubis(true, 100, "Anubis's Adept",20, 2, 10, 100, "Potężny bóg śmierci");
        Trademan Goblin = new Trademan(false, 40, "Goblin żyd", 10, "Zielony mały ziomke");

        Goblin.Attack();  Goblin.Attack();  Goblin.Attack();

    }
}
