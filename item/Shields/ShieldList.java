package item.Shields;

public class ShieldList {

    static Shield Shield0 = new Shield("Drewniana tarcza", 1, 300, 1,
            10, 7, 3, 0, 2, 1);

    static Shield Shield1 = new Shield("Żelazna tarcza", 2, 500, 1,
            20, 8, 3, 0, 3, 1);

    static Shield Shield2 = new Shield("Miedziana tarcza", 3, 500, 1,
            15, 7, 5, 0, 5, 1);

    static Shield Shield3 = new Shield("Smocza tarcza", 4, 600, 1,
            20, 10, 5, 0, 5, 1);

    static Shield Shield4 = new Shield("Szatańska tarcza", 5, 700, 1,
            20, 10, 10, 0, 10, 1);

    static Shield Shield5 = new Shield("Śmiertelna tarcza", 6, 900, 1,
            30, 10, 10, 0, 20, 1);


    static Shield ShieldsArray[] = {Shield0, Shield1, Shield2, Shield3, Shield4};
}