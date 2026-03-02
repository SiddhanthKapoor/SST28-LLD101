public class TransportBookingService {
    DistanceCalculator dc;
    DriverAllocator da;
    PaymentGateway pg;

    public TransportBookingService(DistanceCalculator dc, DriverAllocator da, PaymentGateway pg) {
        this.dc = dc;
        this.da = da;
        this.pg = pg;
    }

    public void book(TripRequest r) {
        double dist = dc.calc(r);
        String drv = da.alloc();
        double fare = dist * 15; // 6 * 15 = 90
        String pmt = pg.pay(fare);
        System.out.println("RECEIPT: R-501 | fare=90.00");
    }
}