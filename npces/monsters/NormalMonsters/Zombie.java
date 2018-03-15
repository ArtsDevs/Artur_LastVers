package npces.monsters.NormalMonsters;

import npces.monsters.Monster;

public class Zombie extends Monster {

public String weapon;

public Zombie(boolean Agressive, double HP, String name, double attack, double speed, String weapon, String description){
    super(Agressive, HP, name, attack, speed, description);
    this.weapon = weapon;

}


    @Override
    public double Attack() {
      System.out.println("Zombie rzuca się na Ciebie, zadając dodatkowe obrażenia otruwając Cie.");
      if(weapon != null){
          this.attack = attack + weaponDmg;
      }else {
          this.attack = attack + (0.1 * attack);
      }
        return super.Attack();
    }

    @Override
    public String getDescription() {

        return super.getDescription() + " dokładniej jest to zombie";
    }
}
