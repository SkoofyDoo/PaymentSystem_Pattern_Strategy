public class CreditCardPayment implements PaymentStrategy {

    String cardNumber;
    private double balance;

    public CreditCardPayment (String cardNumber, double balance){
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public void pay(int amount) {
        if(balance >= amount){
            balance -= amount;
        System.out.println("Bezahlt " + amount + "$ mit Kreditkarte NR: " + cardNumber + " \nNeues Guthaben: " + balance);
        } else {
            System.out.println("Zahlung fehlgeschlagen! Nicht genügend Guthaben");
        }
    }
}


