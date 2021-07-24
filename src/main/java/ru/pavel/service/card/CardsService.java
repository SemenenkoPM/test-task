package ru.pavel.service.card;

import ru.pavel.domain.BankingProduct;
import ru.pavel.service.ProductsService;

public interface CardsService extends ProductsService {
    default void debitFromBankProduct(BankingProduct product, double amount) {
        product.setBalance(product.getBalance() - amount);
    }
}
