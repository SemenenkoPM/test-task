package ru.pavel.service.deposit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.Deposit;

@DisplayName("Класс DepositServiceImpl должен корректно: ")
public class DepositServiceImplTest {
    private final Deposit deposit = new Deposit("deposit", "RUB", 0);
    private final DepositService depositService = new DepositServiceImpl();
    private final static double AMOUNT = 20.0;

    @DisplayName("пополнять депозит")
    @Test
    public void shouldHaveCorrectReplenishmentDeposit() {
        depositService.replenishmentProduct(deposit, AMOUNT);
        Assertions.assertEquals(AMOUNT, deposit.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        depositService.replenishmentProduct(deposit, AMOUNT);
        Assertions.assertEquals(AMOUNT, depositService.balanceInquiry(deposit));
    }

    @DisplayName("закрывать депозит")
    @Test
    public void shouldHaveCorrectToCloseDeposit() {
        depositService.replenishmentProduct(deposit, AMOUNT);
        depositService.closeDeposit(deposit);
        Assertions.assertEquals(0, depositService.balanceInquiry(deposit));
    }
}