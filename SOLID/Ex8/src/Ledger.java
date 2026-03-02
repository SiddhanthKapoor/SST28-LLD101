public class Ledger implements FinanceTool {
    int balance = 0;
    public void addMoney(int amount, String source) {
        balance += amount;
        System.out.println("Ledger: +" + amount + " (" + source + ")");
    }
    public int getBalance() {
        return balance;
    }
}
