package tests;
//

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.*;


public class TestPracticeForm {
    @Test
    void TestAutomatin() {
        String name = "Dmitriy",
                lastname = "Petrov",
                email = "dmpetrov@mail.ru",
                mobile = "99999999",
                subject = "English",
                current_address = "Lenina";


        open("https://demoqa.com/automation-practice-form");

        $("#firstName").val(name);
        $("#lastName").val(lastname);
        $("#userEmail").val(email);
        $("#userNumber").val(mobile);
        $("#dateOfBirthInput").click();
        $(byXpath("//div[contains(@class, 'react-datepicker__day--')]")).click();
        $(byXpath("//*[text()='Sports']")).click();
        $(byXpath("//*[contains(text(), 'Male')]")).click();
        $("#currentAddress").val(current_address);
        $("#submit").click();

        System.out.printf("");

    }

}
