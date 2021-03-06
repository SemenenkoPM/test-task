package ru.pavel.domain;

public class CreditCard extends BankingProduct {
    private final double interestRate;

    public CreditCard(String name, String currency, double balance, double interestRate) {
        super(name, currency, balance);
        this.interestRate = interestRate;
    }
}
