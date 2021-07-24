package ru.pavel.service.depositsservice;

import ru.pavel.domain.BankingProducts;
import ru.pavel.service.ProductsService;

public interface DepositService extends ProductsService {
    default void closeDeposit(BankingProducts bankingProduct) {
        bankingProduct.setBalance(0);
    }
}
