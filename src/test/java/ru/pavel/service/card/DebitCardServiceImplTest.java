package ru.pavel.service.card;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.DebitCard;

@DisplayName("Класс DebitCardServiceImpl должен корректно: ")
public class DebitCardServiceImplTest {
    private final DebitCard debitCard = new DebitCard("debit card", "RUB", 0.0);
    private final CardsService debitCardService = new DebitCardServiceImpl();
    private final static double AMOUNT = 20.0;
    private final static double NEGATIVE_AMOUNT = -20.0;

    @DisplayName("пополнять карту")
    @Test
    public void shouldHaveCorrectReplenishmentCard() {
        debitCardService.replenishmentProduct(debitCard, AMOUNT);
        Assertions.assertEquals(AMOUNT, debitCard.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        debitCardService.replenishmentProduct(debitCard, AMOUNT);
        Assertions.assertEquals(AMOUNT, debitCardService.balanceInquiry(debitCard));
    }

    @DisplayName("проводить списание с карты")
    @Test
    public void shouldHaveCorrectDebitFromCard() {
        debitCardService.debitFromBankProduct(debitCard, AMOUNT);
        Assertions.assertEquals(NEGATIVE_AMOUNT, debitCardService.balanceInquiry(debitCard));
    }
}
