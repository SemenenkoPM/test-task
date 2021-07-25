package ru.pavel.service.deposit;

import ru.pavel.domain.BankingProduct;
import ru.pavel.service.ProductsService;

public interface DepositService extends ProductsService {
    default void closeDeposit(BankingProduct bankingProduct) {
        bankingProduct.setBalance(0.0);
    }
}
