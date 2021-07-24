package ru.pavel.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public abstract class BankingProduct {
    private final String name;
    private final String currency;
    private double balance;
}
