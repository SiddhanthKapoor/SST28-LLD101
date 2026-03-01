public class Main {
    public static void main(String[] args) {
        System.out.println("=== Smart Classroom ===");
        
        Projector p = new Projector();
        Lights l = new Lights();
        AC a = new AC();
        AttendanceScanner as = new AttendanceScanner();
        
        p.turnOn();
        l.setBrightness(60);
        a.setTemp(24);
        as.scan();
        
        Controller c = new Controller();
        c.addPowerDevice(p);
        c.addPowerDevice(l);
        c.addPowerDevice(a);
        
        c.shutdown();
    }
}
