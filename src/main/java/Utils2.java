public class Utils2 {

    public static double dumpedFuel = 0.0;

    public void unfuel(Fuellable something){
        dumpedFuel += something.fuel;
        something.fuel = 0;
    }
}
