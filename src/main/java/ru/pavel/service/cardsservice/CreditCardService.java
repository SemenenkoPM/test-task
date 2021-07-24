package ru.pavel.service.cardsservice;

import ru.pavel.domain.CreditCard;
import ru.pavel.service.ProductsService;

public interface CreditCardService extends ProductsService, CardsService {
    double cardDebtRequest(CreditCard creditCard);
}
