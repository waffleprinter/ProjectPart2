package org.example;

public class CreditCard {
    private Money balance = new Money(0);
    private Money creditLimit;
    private Person owner;

    CreditCard(Person newCardHolder, Money limit) {
        owner = newCardHolder;
        creditLimit = new Money(limit);
    }

    public Money getBalance() {
        return new Money(balance);
    }

    public Money getCreditLimit() {
        return new Money(creditLimit);
    }

    public String getPersonals() {
        return owner.toString();
    }

    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) != 1) {
            balance = balance.add(amount);
        } else {
            System.out.println("Exceeds credit limit");
        }
    }

    public void payment(Money amount) {
        balance = balance.subtract(amount);
    }
}
