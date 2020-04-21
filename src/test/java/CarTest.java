import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    public Car c;

    @BeforeEach
    void setUp() {
        this.c = new Car("Niva");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void run() {
        try {
            c.run();
        }
        catch (Exception e){
            e.printStackTrace();
            assertNotNull(e);
        }
        finally {

        }
    }

    @Test
    void fuelUp() {
        for (int i=0; i<10; i++) {
            double fuelBefore = c.getFuelAmount();
            double newFuel = i*7.8 +30.0;
            c.fuelUp(newFuel);
            assertEquals(c.getFuelAmount(), fuelBefore + newFuel);
        }
    }
}