package ru.pavel.service.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.CurrencyDebitCard;

@DisplayName("Класс CurrencyDebitCardServiceImpl должен корректно: ")
public class CurrencyDebitCardServiceImplTest {
    private final CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard("currency debit card", "USD", 0.0);
    private final CardsService currencyDebitCardService = new CurrencyDebitCardServiceImpl();
    private final static double AMOUNT = 20.0;
    private final static double NEGATIVE_AMOUNT = -20.0;

    @DisplayName("пополнять карту")
    @Test
    public void shouldHaveCorrectReplenishmentCard() {
        currencyDebitCardService.replenishmentProduct(currencyDebitCard, AMOUNT);
        Assertions.assertEquals(AMOUNT, currencyDebitCard.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        currencyDebitCardService.replenishmentProduct(currencyDebitCard, AMOUNT);
        Assertions.assertEquals(AMOUNT, currencyDebitCardService.balanceInquiry(currencyDebitCard));
    }

    @DisplayName("проводить списание с карты")
    @Test
    public void shouldHaveCorrectDebitFromCard() {
        currencyDebitCardService.debitFromBankProduct(currencyDebitCard, AMOUNT);
        Assertions.assertEquals(NEGATIVE_AMOUNT, currencyDebitCardService.balanceInquiry(currencyDebitCard));
    }
}
