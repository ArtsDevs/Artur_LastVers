package npces.neutrals;
import java.util.Random;
import npces.Npcs;

public class Trademan extends Neutrals {

    public Object Items4Sell[];

    public Trademan(boolean Aggresive, double HP, String name, double money, String description){
        super(Aggresive, HP, name, money, description);
    }

    @Override
    public double Attack() {
        Random generator = new Random();
        double rand = generator.nextInt(11); //Trzeba dopisać *0.1 PlayerHP;
        System.out.println(rand);
        return rand;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public double getMoney() {
        return 0;
    }
    @Override
    public void setMoney(double money) {

    }

    @Override
    public Object getItems(int i) {
        return null;
    }


}
