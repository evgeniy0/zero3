public class FuelStation {

    private static FuelStation instance = null;

    public static FuelStation getFuelStationInstance(){
        if (instance == null){
            instance = new FuelStation();
        }
        return instance;
    }

    private FuelStation(){

    }
}
