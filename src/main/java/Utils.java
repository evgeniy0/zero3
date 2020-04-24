public class Utils {

    public static double dumpedFuel=0;

    public static void unfuel(Fuellable something){
        dumpedFuel += something.fuel;
        something.fuel = 0;

    }
}
