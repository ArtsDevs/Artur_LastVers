package skills;


import character.Player;
import character.Warrior;

import java.util.EmptyStackException;
import java.util.Random;

public class WarriorSkills {

    public double basic() {
        Warrior.rage = Warrior.rage += 20;
        return Warrior.attack;
    }

    public double whirlwind() {
        double w1;
        w1 = Warrior.attack * Warrior.rage * 0.2;
        Warrior.setRage(0);
        return w1;
        
    }

    public double heroicStrike() {
        double w1;
        double r1 = 80;
        if (Warrior.rage >= r1) {

            w1 = Warrior.attack + 50;
            Warrior.setRage(Warrior.rage - r1);
            return w1;
        } else {
            throw new EmptyStackException();
        }
    }

    public double charge() {
        double w1;
        double r1 = 40;
        if (Warrior.rage >= 40) {
            w1 = Warrior.attack * 2;
            Warrior.setRage(Warrior.rage - r1);
            return w1;
        } else {
            throw new EmptyStackException();
        }
    }

    public double block() {
        Random generate = new Random();
        int b1;
        b1 = generate.nextInt(3) + 1;
        if (b1 == 2) {
            return Warrior.rage += 20;
        } else {
            throw new EmptyStackException();
        }
    }
}

