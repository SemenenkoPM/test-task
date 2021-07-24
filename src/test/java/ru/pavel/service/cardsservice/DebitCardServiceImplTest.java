package ru.pavel.service.cardsservice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.pavel.domain.DebitCard;

@DisplayName("Класс DebitCardServiceImpl должен корректно: ")
public class DebitCardServiceImplTest {
    private DebitCard debitCard = new DebitCard("debit card", "RUB", 0.0);
    private CardsService debitCardService = new DebitCardServiceImpl();

    @DisplayName("пополнять карту")
    @Test
    public void shouldHaveCorrectReplenishmentCard() {
        debitCardService.replenishmentProduct(debitCard, 20);
        Assertions.assertEquals(20, debitCard.getBalance());
    }

    @DisplayName("запрашивать баланс")
    @Test
    public void shouldHaveCorrectBalanceInquiry() {
        debitCardService.replenishmentProduct(debitCard, 20);
        Assertions.assertEquals(20, debitCardService.balanceInquiry(debitCard));
    }

    @DisplayName("проводить списание с карты")
    @Test
    public void shouldHaveCorrectDebitFromCard() {
        debitCardService.debitFromBankProduct(debitCard, 30);
        Assertions.assertEquals(-30, debitCardService.balanceInquiry(debitCard));
    }
}
