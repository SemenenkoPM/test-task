package ru.pavel.service;

import ru.pavel.domain.BankingProducts;

public interface ProductsService {
    default void replenishmentProduct(BankingProducts product, double replenishmentAmount) {
        product.setBalance(product.getBalance() + replenishmentAmount);
    }

    default double balanceInquiry(BankingProducts product) {
        return product.getBalance();
    }
}
