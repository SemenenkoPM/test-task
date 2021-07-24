package ru.pavel.service.depositsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.Deposit;

@DisplayName("Класс DepositServiceImpl должен корректно: ")
public class DepositServiceImplTest {
    private Deposit deposit = new Deposit("deposit", "RUB", 0);
    private DepositService depositService = new DepositServiceImpl();

    @DisplayName("пополнять депозит")
    @Test
    public void shouldHaveCorrectReplenishmentDeposit() {
        depositService.replenishmentProduct(deposit, 20);
        Assertions.assertEquals(20, deposit.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        depositService.replenishmentProduct(deposit, 20);
        Assertions.assertEquals(20, depositService.balanceInquiry(deposit));
    }

    @DisplayName("закрывать депозит")
    @Test
    public void shouldHaveCorrectСloseDeposit() {
        depositService.replenishmentProduct(deposit, 20);
        depositService.closeDeposit(deposit);
        Assertions.assertEquals(0, depositService.balanceInquiry(deposit));
    }
}
