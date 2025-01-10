package app;

public class BankTransferPayment implements PaymentStrategy{
    private String id;
    private double balance;

    public BankTransferPayment(String id, double balance){
                this.id = id;
                this.balance = balance;
    }


    @Override
    public void pay(int amount) {
        if(balance >= amount){
            balance -= amount;
            System.out.println("Bezahlt: " + amount + "$ per BankTransfer \nNeues Guthaben: " + balance +"$");
        } else {
            System.out.println("Zahlung fehlgeschlagen! Nicht genügend Guthaben");
        }
    }
    public  String toString(){
        return "BankTransfer";

    }
}
