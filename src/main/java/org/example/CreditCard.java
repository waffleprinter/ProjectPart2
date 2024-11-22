package org.example;

/**
 @author Jacques-Conrad Calagui-Painchaud 6298805
 This class defines a credit card with a balance, credit limit, and owner.
 */
public class CreditCard {
    private Money balance = new Money(0);
    private final Money creditLimit;
    private final Person owner;

    /**
     Constructor
     @param newCardHolder The person to whom the credit card belongs to.
     @param limit The credit card's credit limit.
     */
    CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = new Money(limit);
    }

    /**
     The getBalance method
     @return The current balance associated with the account.
     */
    public Money getBalance() {
        return new Money(balance);
    }

    /**
     The getCreditLimit method
     @return The current credit limit associated with the account.
     */
    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    /**
     The getPersonals method
     @return The owner of the account as a string.
     */
    public String getPersonals() {
        return owner.toString();
    }

    /**
     The charge method
     @param amount The amount of money to be added to the balance.
     Adds an amount of money to the balance. If the new balance would exceed the credit limit, an error message is
     printed to the console instead.
     */
    public void charge(Money amount) {
        Money newBalance = balance.add(amount);

        if (newBalance.compareTo(creditLimit) != 1) {
            balance = newBalance;
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    /**
     The payment method
     @param amount The amount of money to be subtracted from the balance.
     Subtracts an amount of money to the balance. If the new balance dip below 0, an error message is
     printed to the console instead.
     */
    public void payment(Money amount) {
        Money newBalance = balance.subtract(amount);

        if (newBalance.compareTo(new Money(0)) != -1) {
            balance = newBalance;
        } else {
            System.out.println("Do not try to pay more than is due.");
        }
    }
}
