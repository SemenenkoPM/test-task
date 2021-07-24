package ru.pavel.service;

import ru.pavel.domain.BankingProduct;

public interface ProductsService {
    default void replenishmentProduct(BankingProduct product, double replenishmentAmount) {
        product.setBalance(product.getBalance() + replenishmentAmount);
    }

    default double balanceInquiry(BankingProduct product) {
        return product.getBalance();
    }
}
