package equipment;

import character.Player;

public class Eq {

    public static Object[][] bag = new Object[3][3];

    public static void addItemToBag(Object obj){
        for(int i = 0; i < bag.length; i++){
            for(int j = 0; j < bag.length; j++){
                if(bag[i][j] == null){
                    bag[i][j] = obj;
                }
            }
        }
    }




}
