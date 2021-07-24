package ru.pavel.service.cardsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.CreditCard;

@DisplayName("Класс CreditCardServiceImpl должен корректно: ")
public class CreditCardServiceImplTest {
    private CreditCard creditCard = new CreditCard("credit card", "RUB", 0.0, 10.0);
    private CreditCardService creditCardService = new CreditCardServiceImpl();

    @DisplayName("пополнять карту")
    @Test
    public void shouldHaveCorrectReplenishmentCard() {
        creditCardService.replenishmentProduct(creditCard, 20);
        Assertions.assertEquals(20, creditCard.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        creditCardService.replenishmentProduct(creditCard, 20);
        Assertions.assertEquals(20, creditCardService.balanceInquiry(creditCard));
    }

    @DisplayName("проводить списание с карты")
    @Test
    public void shouldHaveCorrectDebitFromCard() {
        creditCardService.debitFromBankProduct(creditCard, 30);
        Assertions.assertEquals(-30, creditCardService.balanceInquiry(creditCard));
    }

    @DisplayName("производить запрос задолженности")
    @Test
    public void shouldHaveCorrectCardDebtRequest() {
        creditCardService.debitFromBankProduct(creditCard, 30);
        Assertions.assertEquals(-30, creditCardService.cardDebtRequest(creditCard));
    }
}
