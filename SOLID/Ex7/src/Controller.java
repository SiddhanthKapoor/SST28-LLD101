import java.util.ArrayList;
import java.util.List;

public class Controller {
    List<PowerDevice> powerDevices = new ArrayList<>();
    
    public void addPowerDevice(PowerDevice pd) {
        powerDevices.add(pd);
    }
    
    public void shutdown() {
        System.out.println("Shutdown sequence:");
        for (PowerDevice p : powerDevices) {
            p.turnOff();
        }
    }
}
