public class Car extends Fuellable implements Gudit{
    public Wheel[] wheels = new Wheel[4];
    public String model;

    public void run(){
        System.out.println("Zoom-zoom");
    }

    public Car(){
        System.out.println("Car constructor");
        /*
        for (int i = 0; i<4; i++){
            this.wheels[i] = new Wheel();
        }

         */
    }
    public Car(String name){
        this();
        this.model = name;
    }

    public void fuelUp(double newFuel) {
        this.fuel += newFuel;
    }
}
