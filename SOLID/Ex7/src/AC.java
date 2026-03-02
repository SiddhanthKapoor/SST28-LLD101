public class AC implements PowerDevice, TemperatureDevice {
    public void turnOn() {}
    public void turnOff() {
        System.out.println("AC OFF");
    }
    public void setTemp(int temp) {
        System.out.println("AC set to " + temp + "C");
    }
}
