package ru.pavel.service.card;

import ru.pavel.domain.CreditCard;

public interface CreditCardService extends CardsService{
    double cardDebtRequest(CreditCard creditCard);
}
