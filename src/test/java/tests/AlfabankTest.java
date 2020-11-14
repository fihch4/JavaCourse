package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;

public class AlfabankTest {


    @Test
    void TestAlfa(){
        Selenide.open("https://alfabank.ru/");
        Selenide.$(Selectors.byText("Вклады")).click();
        Selenide.$("body").shouldHave(Condition.text("Накопительные продукты"));
    }
}
