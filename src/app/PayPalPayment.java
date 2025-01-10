package app;

public class PayPalPayment implements PaymentStrategy {
    String email;
    private double balance;

    public PayPalPayment(String email, double balance){
        this.email = email;
        this.balance = balance;
    }
    @Override
    public void pay(int amount) {
        if(balance >= amount){
            balance -= amount;
        System.out.println("Bezahlt: " + amount + "$ mit PayPal " + email + " \nNeues Guthaben: " + balance + "$");
        } else {
            System.out.println("Zahlung fehlgeschlagen! Nicht genügend Guthaben");
        }
    }
    public  String toString(){
        return "PayPal";
    }
}
