package ru.pavel.domain;

import lombok.Data;

@Data
public class CreditCard extends BankingProducts {
    private double interestRate;

    public CreditCard(String name, String currency, double balance, double interestRate) {
        super(name, currency, balance);
        this.interestRate = interestRate;
    }
}
