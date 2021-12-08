package ru.netology.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import ru.netology.data.DataHelper;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public class TransferPage {
    private SelenideElement sumField = $("[data-test-id=amount] input");
    private SelenideElement cardField = $("[data-test-id='from'] input");
    private SelenideElement transferButton = $("[data-test-id=action-transfer]");

    public void moneyTransfer(DataHelper.CardData cardData, int amount) {
        sumField.setValue(String.valueOf(amount));
        cardField.setValue(cardData.getCardNumber());
        transferButton.click();
    }

}
