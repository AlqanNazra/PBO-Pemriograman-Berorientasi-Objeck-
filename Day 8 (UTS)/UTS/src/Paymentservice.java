abstract class PaymentService {
    private boolean paymentStatus;
    private String paymentMethod;

    public PaymentService(boolean paymentStatus, String paymentMethod) {
        this.paymentStatus = paymentStatus;
        this.paymentMethod = paymentMethod;
    }

    public void showPaymentDetails() {
        System.out.println("Payment Status: " + paymentStatus);
        System.out.println("Payment Method: " + paymentMethod);
    }

    public abstract void processPayment();
}
