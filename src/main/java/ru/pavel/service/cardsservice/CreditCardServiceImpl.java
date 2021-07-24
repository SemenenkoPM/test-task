package ru.pavel.service.cardsservice;

import ru.pavel.domain.CreditCard;
import ru.pavel.service.ProductsService;

public class CreditCardServiceImpl implements ProductsService, CreditCardService, CardsService {

    @Override
    public double cardDebtRequest(CreditCard creditCard) {
        double balance = creditCard.getBalance();
        if (balance >= 0) {
            return 0;
        } else {
            return balance;
        }
    }
}
