package ru.pavel.service.cardsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.CurrencyDebitCard;

@DisplayName("Класс CurrencyDebitCardServiceImpl должен корректно: ")
public class CurrencyDebitCardServiceImplTest {
    private CurrencyDebitCard currencyDebitCard = new CurrencyDebitCard("currency debit card", "USD", 0.0);
    private CardsService currencyDebitCardService = new CurrencyDebitCardServiceImpl();

    @DisplayName("пополнять карту")
    @Test
    public void shouldHaveCorrectReplenishmentCard() {
        currencyDebitCardService.replenishmentProduct(currencyDebitCard, 20);
        Assertions.assertEquals(20, currencyDebitCard.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        currencyDebitCardService.replenishmentProduct(currencyDebitCard, 20);
        Assertions.assertEquals(20, currencyDebitCardService.balanceInquiry(currencyDebitCard));
    }

    @DisplayName("проводить списание с карты")
    @Test
    public void shouldHaveCorrectDebitFromCard() {
        currencyDebitCardService.debitFromBankProduct(currencyDebitCard, 30);
        Assertions.assertEquals(-30, currencyDebitCardService.balanceInquiry(currencyDebitCard));
    }
}
