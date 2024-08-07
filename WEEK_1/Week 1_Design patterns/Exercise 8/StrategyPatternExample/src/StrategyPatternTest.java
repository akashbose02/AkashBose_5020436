// StrategyPatternTest.java
public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        // Using Credit Card Payment Strategy
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/25");
        paymentContext.setPaymentStrategy(creditCardPayment);
        paymentContext.executePayment(250.00);
        System.out.println("");

        // Using PayPal Payment Strategy
        PaymentStrategy payPalPayment = new PayPalPayment("johndoe@example.com", "password");
        paymentContext.setPaymentStrategy(payPalPayment);
        paymentContext.executePayment(150.00);
    }
}
