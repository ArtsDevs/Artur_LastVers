package Map;

public class Locations {
    int id;
    String description;
    int choice;


    //move
            public int north(){
                System.out.println("Idziesz na północ");
                return 1; }

            public static int south(){
                System.out.println("Idziesz na południe");
                return 2;}

            public static int east(){
                System.out.println("idziesz na wschód");
                return 3;}

            public static int west (){
                System.out.println("Idziesz na zachód");
                return 4;
            }

public void move(int a){
            switch (choice = a) {
        case 1:
            north();
            break;
        case 2:
            south();
            break;
        case 3:
            east();
            break;
        case 4:
            west();
            break;

        default:
            System.out.println("Wybrałeś złą opcje");
    }}
}
