package Payment;

public class Paypal implements PaymentHelp{
    @Override
    public boolean PaymentProcess(double cost) {
        System.out.println("Processing Payment---paypal");
        return true;
    }
}
