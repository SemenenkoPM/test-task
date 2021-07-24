package ru.pavel.service.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.CreditCard;

@DisplayName("Класс CreditCardServiceImpl должен корректно: ")
public class CreditCardServiceImplTest {
    private final CreditCard creditCard = new CreditCard("credit card", "RUB", 0.0, 10.0);
    private final CreditCardService creditCardService = new CreditCardServiceImpl();
    private final static double AMOUNT = 20.0;
    private final static double NEGATIVE_AMOUNT = -20.0;

    @DisplayName("пополнять карту")
    @Test
    public void shouldHaveCorrectReplenishmentCard() {
        creditCardService.replenishmentProduct(creditCard, AMOUNT);
        Assertions.assertEquals(AMOUNT, creditCard.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        creditCardService.replenishmentProduct(creditCard, AMOUNT);
        Assertions.assertEquals(AMOUNT, creditCardService.balanceInquiry(creditCard));
    }

    @DisplayName("проводить списание с карты")
    @Test
    public void shouldHaveCorrectDebitFromCard() {
        creditCardService.debitFromBankProduct(creditCard, AMOUNT);
        Assertions.assertEquals(NEGATIVE_AMOUNT, creditCardService.balanceInquiry(creditCard));
    }

    @DisplayName("производить запрос задолженности")
    @Test
    public void shouldHaveCorrectCardDebtRequest() {
        creditCardService.debitFromBankProduct(creditCard, AMOUNT);
        Assertions.assertEquals(NEGATIVE_AMOUNT, creditCardService.cardDebtRequest(creditCard));
    }
}
