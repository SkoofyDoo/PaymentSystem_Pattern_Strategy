
public class Main {

    public static void main(String[] args) {

    ShoppingCart s = new ShoppingCart();
    s.setPaymentStrategy(new PayPalPayment("evgenykvest@gmail.com", 1000.00));
    s.checkout(300);
    s.checkout(250);

    s.setPaymentStrategy(new CreditCardPayment("3333-3333-3333-3333", 1000.00));
    s.checkout(333);

    s.setPaymentStrategy(new BankTransferPayment("22", 1000.00));
    s.checkout(100) ;

    s.showHistory();

    }
}
