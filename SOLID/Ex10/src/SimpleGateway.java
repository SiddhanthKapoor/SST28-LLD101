public class SimpleGateway implements PaymentGateway {
    public String pay(double amt) {
        System.out.println("Payment=PAID txn=TXN-9001");
        return "TXN-9001";
    }
}