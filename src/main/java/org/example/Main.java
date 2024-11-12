package org.example;

public class Main {
    public static void main(String[] args) {
        Money money1 = new Money(1.09124214);
        Money money2 = new Money(2.0041241);
        System.out.println(money1.add(money2));
    }
}
