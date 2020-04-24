public class Truck extends Car {

    @Override
    public void run() {
        System.err.println("WROOM-WROOM");
    }

    @Override
    public double getFuelAmount() {
        if (this.fuel<50.0){
            return super.getFuelAmount();
        }
        else{
            return 50.0;
        }

    }
}
