package app;

import java.util.ArrayList;
import java.util.List;


public class ShoppingCart {

    private PaymentStrategy strategy;

    private List<PaymentHistory> history = new ArrayList<>();

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }


    public void checkout(int amount) {

        if (strategy == null) {
            System.out.println("Keine Bezahlmethode ausgewählt");
            return;
        }
        System.out.println("\nPayment Start: ");
        strategy.pay(amount);

        history.add(new PaymentHistory(strategy.toString(), amount));

    }

    public void showHistory(){
        System.out.println("\nTransaktion history: ");
        // alternative Schreibweise des Lambda-Ausdrucks
        history.forEach(System.out::println);

        // oben ist die kürzere und elegantere Schreibweise
//        for (app.PaymentHistory ph : history ){
//            System.out.println(ph);
//        }
    }


}

