package GameMech;
import java.util.Scanner;
public class Move {

    static Scanner scanner = new Scanner(System.in);

    static int a = scanner.nextInt();

    public static void movenorth() {
        switch (a) {
            case 1:
                System.out.println("Idziesz na północ");
                break;
            default:
                System.out.println("Nie możesz tam iść");
        }
    }

    public static void movesouth() {
        switch (a) {
            case 2:
                System.out.println("Idziesz na południe");
                break;
            default:
                System.out.println("Nie możesz tam iść");
        }
    }

    public static void movewest() {
        switch (a) {
            case 3:
                System.out.println("Idziesz na zaachód");
                break;
            default:
                System.out.println("Nie możesz tam iść");
        }
    }
        public static void moveeast (){
            switch (a) {
                case 4:
                    System.out.println("Idziesz na wschód");
                    break;
                default:
                    System.out.println("Nie możesz tam iść");
            }
        }

        public static void move1(){
        if(a==1){
            movenorth(); }
                else if(a==2){
                    movesouth(); }
                        else if(a==3){
                            movewest(); }
                                else if(a==4){
                                    moveeast(); }
                                        else {System.out.println("Nie możesz tam iść");
                                        }
        }

        public static void Forest(){
        move1();
        }

        public static void MainSquare(){
            move1();
        }
        public static void OldCity(){
            move1();
        }
        public static void Mine(){
            move1();
        }


    }
