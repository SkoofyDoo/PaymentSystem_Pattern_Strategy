public class PaymentHistory  {
    private String method;
    private double amount;

    public PaymentHistory(String method, double amount) {
        this.amount = amount;
        this.method = method;
    }

    @Override
    public String toString(){
        return
        "Method |" + method + "|\n" +
        "Amount: " + amount + "$";
    }
}
