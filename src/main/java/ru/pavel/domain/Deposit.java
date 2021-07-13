package ru.pavel.domain;

import lombok.Data;

@Data
public class Deposit extends BankingProducts{
    public Deposit(String name, String currency, double balance) {
        super(name, currency, balance);
    }
}
