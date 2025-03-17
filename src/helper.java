public class helper {
    public static Session help(String User){
        switch (User) {
            case "customer" -> {
                return new CustomerSession();
            }
            case "manager" -> {
                return new ManagerSession();
            }
            case "delivery" -> {
                return new DeliverySession();
            }
        }
        throw new IllegalArgumentException("Invalid User type");
    }
}
