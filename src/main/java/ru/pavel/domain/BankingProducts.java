package ru.pavel.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class BankingProducts {
    private String name;
    private String currency;
    private double balance;
}
