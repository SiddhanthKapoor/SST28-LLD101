public class SimpleAllocator implements DriverAllocator {
    public String alloc() {
        System.out.println("Driver=DRV-17");
        return "DRV-17";
    }
}