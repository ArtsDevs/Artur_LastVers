package character.PlayerMech;

import character.Player;

import java.util.Random;

public class Tools {

    public void Rest() {
        if(Player.currentHp < Player.maxHp && Player.currentHp > 0){
            Player.currentHp = Player.maxHp;
        }else if(Player.currentHp < 0){
            System.out.println("Nic ci już nie pomoże");
        }else{
            System.out.println("Jesteś całkowicie zdrowy");
        }}

    public boolean Run() {
        Random generate = new Random();
        int rad = generate.nextInt(10);
        if(Player.speed <= rad){
            System.out.println("Uciekłeś");
            return true;
        }else{
            return false;
        }}

    public double Attack() {
        return Player.attack;
    }

}
