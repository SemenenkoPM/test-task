package ru.pavel.domain;

import lombok.Data;

@Data
public class DebitCard extends BankingProducts{
    public DebitCard(String name, String currency, double balance) {
        super(name, currency, balance);
    }
}
