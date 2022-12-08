import controller.Config;
import controller.CarController;
import controller.Factory;
import controller.ViewController;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.LogManager;

public class Main {
    public static void main(String[] args) {
//        Storage<Body> bodyStorage = new Storage<>(1);
//        Storage<Accessory> accessoryStorage = new Storage<>(1);
//        Storage<Engine> engineStorage = new Storage<>(1);
//        Storage<Car> carStorage = new Storage<>(1);
//        AccessorySupplier accessorySupplier = new AccessorySupplier(accessoryStorage,1000);
//        BodySupplier bodySupplier = new BodySupplier(bodyStorage,1000);
//        EngineSupplier engineSupplier = new EngineSupplier(engineStorage,1000);
//        Dealer dealer = new Dealer(carStorage,1000,null);
//        Worker worker1 = new Worker(bodyStorage,engineStorage,accessoryStorage,carStorage,2000);
//        Worker worker2 = new Worker(bodyStorage,engineStorage,accessoryStorage,carStorage,3000);
//        Worker worker3 = new Worker(bodyStorage,engineStorage,accessoryStorage,carStorage,3000);
//        accessorySupplier.start();
//        bodySupplier.start();
//        engineSupplier.start();
//        worker1.start();
//        dealer.start();

        try {
            LogManager.getLogManager().readConfiguration(new FileInputStream("C:\\Users\\User\\IdeaProjects\\lab7\\src\\main\\resources\\logger.properties"));
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + Arrays.toString(e.getStackTrace()));
        }
        Factory factory = new Factory(new Config());
        CarController carController = new CarController(factory);
        ViewController windowController = new ViewController(carController, factory, new Config());
        carController.start();
    }
}
