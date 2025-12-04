package rvt;
public class payment_card {

    public static void main(String[] args) {

        //  PART 1: constructor + toString 
        System.out.println("== Part 1 ==");
        PaymentCard card1 = new PaymentCard(50);
        System.out.println(card1);
        System.out.println();

        //  PART 2: Making transactions
        System.out.println("== Part 2 ==");
        PaymentCard card2 = new PaymentCard(50);
        System.out.println(card2);

        card2.eatAffordably();
        System.out.println(card2);

        card2.eatHeartily();
        card2.eatAffordably();
        System.out.println(card2);
        System.out.println();

        // PART 3: Non-negative balance 
        System.out.println("== Part 3 ==");
        PaymentCard card3 = new PaymentCard(5);
        System.out.println(card3);

        card3.eatHeartily();
        System.out.println(card3);

        card3.eatHeartily();     
        System.out.println(card3);
        System.out.println();

        //  PART 4: Topping up the card 
        System.out.println("== Part 4 ==");
        PaymentCard card4 = new PaymentCard(10);
        System.out.println(card4);

        card4.addMoney(15);
        System.out.println(card4);

        card4.addMoney(10);
        System.out.println(card4);

        card4.addMoney(200);     
        System.out.println(card4);
        System.out.println();

        // PART 5: Negative top-up
        System.out.println("== Part 5 ==");
        PaymentCard card5 = new PaymentCard(10);
        System.out.println("Paul: " + card5);

        card5.addMoney(-15);     
        System.out.println("Paul: " + card5);
        System.out.println();

        // PART 6: Multiple cards
        System.out.println("== Part 6 ==");
        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);

        
        paulsCard.eatHeartily();
        
        mattsCard.eatAffordably();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        
        paulsCard.addMoney(20);
        
        mattsCard.eatHeartily();

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);

        
        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        
        mattsCard.addMoney(50);

        System.out.println("Paul: " + paulsCard);
        System.out.println("Matt: " + mattsCard);
    }
}



class PaymentCard {
    private double balance;

    public PaymentCard(double openingBalance) {
        this.balance = openingBalance;
    }

    @Override
    public String toString() {
        return "The card has a balance of " + this.balance + " euros";
    }

    public void eatAffordably() {
        double price = 2.60;
        if (this.balance >= price) {  
            this.balance -= price;
        }
    }

    public void eatHeartily() {
        double price = 4.60;
        if (this.balance >= price) {   
            this.balance -= price;
        }
    }

    public void addMoney(double amount) {
        if (amount < 0) {              
            return;
        }

        this.balance += amount;

        if (this.balance > 150.0) {    
            this.balance = 150.0;
        }
    }
}
