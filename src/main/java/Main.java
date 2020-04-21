public class Main {
    public static void main(String args[]){
        System.out.println("Hello, World");

        Car c1 = new Car();
        //c1.wheels[0].setDiameter(33.33);
        Wheel w1 = new Wheel();
        c1.wheels[0] = w1;
        Wheel w2 = new Wheel();
        c1.wheels[1] = w2;

        c1.getFuelAmount();
        c1.fuelUp(10.0);

        Car c2 = new Car("Mazda");

        Truck t1 = new Truck();
        t1.model = "KAMAZ";
        t1.getFuelAmount();
        t1.fuelUp(20.0);


        DieselGenerator dg = new DieselGenerator();


        Gudit[] garage = new Gudit[4];
        garage[0] = c1;
        garage[1] = c2;
        garage[2] = t1;
        garage[3] = dg;


        for (Gudit each : garage){
            each.run();
        }

    }
}
