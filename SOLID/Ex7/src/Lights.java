public class Lights implements PowerDevice, BrightnessDevice {
    public void turnOn() {}
    public void turnOff() {
        System.out.println("Lights OFF");
    }
    public void setBrightness(int level) {
        System.out.println("Lights set to " + level + "%");
    }
}
