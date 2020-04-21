public abstract class Fuellable {
    protected double fuel = 0.0;

    public abstract void fuelUp(double newFuel);

    public double getFuelAmount(){
        return this.fuel;
    }

}
