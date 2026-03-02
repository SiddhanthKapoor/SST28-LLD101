public class Main {
    public static void main(String[] args) {
        System.out.println("=== Transport Booking ===");
        TransportBookingService s = new TransportBookingService(
            new SimpleDistance(),
            new SimpleAllocator(),
            new SimpleGateway()
        );
        s.book(new TripRequest());
    }
}