package Payment;

import java.util.ArrayList;

public class PaymentProcesser {
    private ArrayList<String> Options = new ArrayList<String>();


    public PaymentProcesser() {
        Options.add("PayPal");
        Options.add("GPay");
    }

    public ArrayList<String> getOptions() {
        return Options;
    }

    public PaymentHelp PaymentRequest(String type) {
        return switch (type) {
            case "paypal" -> new Paypal();
            case "gpay" -> new Gpay();
            default -> null;
        };
    }
}
