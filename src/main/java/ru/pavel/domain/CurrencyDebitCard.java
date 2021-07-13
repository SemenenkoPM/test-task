package ru.pavel.domain;

import lombok.Data;

@Data
public class CurrencyDebitCard extends BankingProducts{

    public CurrencyDebitCard(String name, String currency, double balance) {
        super(name, currency, balance);
    }
}
