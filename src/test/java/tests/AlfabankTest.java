package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class AlfabankTest {
    @Test
    void TestAlfaDeposit(){
        open("https://alfabank.ru/make-money/");
        $("h1").shouldHave(text("Накопительные продукты"));
        $x("//*[text()='Депозиты']/ancestor::button").click();
        $("[data-widget-name=\"Button\"]").shouldHave(text("Архивные счета и депозиты")).scrollTo().click();
        $x("//span[text()='Депозиты']").click();
        $$("[data-widget-name=\"CatalogCard\"]").shouldHaveSize(5);
    }

    @Test
    void AlfaInsurance(){
        open("https://alfabank.ru/make-money/");
        $("[data-test-id=\"tabs-list\"]").scrollTo().$("button").sibling(0).click();;
        System.out.println("Hello");

    }
}
