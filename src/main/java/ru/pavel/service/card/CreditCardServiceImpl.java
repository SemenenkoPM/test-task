package ru.pavel.service.card;

import ru.pavel.domain.CreditCard;

public class CreditCardServiceImpl implements CreditCardService {

    @Override
    public double cardDebtRequest(CreditCard creditCard) {
        double balance = creditCard.getBalance();
        return balance >= 0 ? 0 : balance;
    }
}
