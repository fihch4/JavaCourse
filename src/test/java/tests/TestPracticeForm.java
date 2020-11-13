package tests;
//

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.cssClass;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import java.util.Date;
import java.text.SimpleDateFormat;




public class TestPracticeForm {
    @Test
    void TestAutomatin() {

//Присваиваем значения переменным
        String name = "Dmitriy",
                lastname = "Petrov",
                email = "dmpetrov@mail.ru",
                mobile = "9999999999",
                subject = "English",
                gender = "Male",
                hobbies = "Sports",
                current_address = "Lenina";

//Открываем ссылку
        open("https://demoqa.com/automation-practice-form");

//Ввод данных
        $("#firstName").val(name);
        $("#lastName").val(lastname);
        $("#userEmail").val(email);
        $("#userNumber").val(mobile);
        $("#dateOfBirthInput").click();
        $(byXpath("//div[contains(@class, 'react-datepicker__day--')]")).click();
        $(byXpath("//*[text()='Sports']")).click();
        $(byXpath("//*[contains(text(), 'Male')]")).click();
        $("#currentAddress").val(current_address);
        $("#submit").scrollTo();
        $("#submit").click();


//Проверка на заполненные данные
        $(byXpath("//td[text()='Student Name']/following::td[1]")).shouldHave(text(String.format(name + " " + lastname)));
        $(byXpath("//td[text()='Student Email']/following::td[1]")).shouldHave(text(String.format(email)));
        $(byXpath("//td[text()='Gender']/following::td[1]")).shouldHave(text(String.format(gender)));
        $(byXpath("//td[text()='Mobile']/following::td[1]")).shouldHave(text(String.format(mobile)));
        $(byXpath("//td[text()='Hobbies']/following::td[1]")).shouldHave(text(String.format(hobbies)));
        $(byXpath("//td[text()='Address']/following::td[1]")).shouldHave(text(String.format(current_address)));

        System.out.printf(String.format(name + " " + lastname));

    }

}
