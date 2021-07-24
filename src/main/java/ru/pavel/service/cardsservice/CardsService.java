package ru.pavel.service.cardsservice;

import ru.pavel.domain.BankingProducts;
import ru.pavel.service.ProductsService;

public interface CardsService extends ProductsService {
    default void debitFromBankProduct(BankingProducts product, double amount) {
        product.setBalance(product.getBalance() - amount);
    }
}
