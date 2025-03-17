package Payment;

public class Gpay implements PaymentHelp{
    @Override
    public boolean PaymentProcess(double cost) {
        System.out.println("Processing Payment---Gpay");
        return true;
    }
}
