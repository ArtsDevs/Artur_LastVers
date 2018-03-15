package npces.monsters.Bosses;

import java.util.Random;

public class Anubis extends Gods {

    public Anubis(boolean Agressive, double HP, String name, double attack, double speed, double resistance, double stamina, String description){
        super(Agressive,HP,name,attack,speed,resistance,stamina, description);
    }

    @Override
    public String BossInfo() {
        return "anubis example";
    }

    @Override
    public boolean Skill() {
        boolean check;
        if (stamina > 2) {
            this.stamina = stamina -25;
            System.out.println("Anubis uderze Cię swoim biczem dziwko.");
            System.out.println("Kiedys to byl anubis a tera to. Kuuurua");
             check = true;

            } else {
            System.out.println("Boss nie ma many");
            check = false;

        }return check;}



    public double Attack() {
        Random generate = new Random();
        int add = generate.nextInt(3)+1;

        System.out.println("Anubis atakuje: ");
        if(Skill() == true){
            this.attack = attack*add;
            System.out.println("Anubis atakuje za: " + this.attack);
            return this.attack;
        }else {
            this.attack = attack;
            System.out.println("Anubis atakuje za: " + this.attack);
        }
        System.out.println("końcowo "  + this.attack);
        return this.attack;


    }

    @Override
    public String getDescription() {
        return description;
    }


}
