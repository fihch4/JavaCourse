package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class TestPracticeForms {
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }
    @Test
    void fillformtest() {
        String name = "Dmitriy",
                lastname = "Petrov",
                email = "dmpetrov@mail.ru",
                mobile = "9999999999",
                gender = "Male",
                hobby = "Sports",
                current_address = "Lenina";

        open("https://demoqa.com/automation-practice-form");
        $("#firstName").val(name);
        $("#lastName").val(lastname);
        $("#userEmail").val(email);
        $("#genterWrapper").$(byText(gender)).click();
        $("#userNumber").val(mobile);
        $("#hobbiesWrapper").$(byText(hobby)).click();
        //Выбор даты рождения
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("May");
        $(".react-datepicker__year-select").selectOption("1992");
        $(".react-datepicker__day--005").click();
        //Заполнение адреса и выбор города
        $("#currentAddress").val(current_address);
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Rajasthan")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Jaipur")).click();
        $("#submit").scrollTo().click();
        //Проверка данных
        $x("//td[text()='Student Name']/following::td[1]").shouldHave(text(name + " " + lastname));
        $x("//td[text()='Student Email']/following::td[1]").shouldHave(text(email));
        $x("//td[text()='Gender']/following::td[1]").shouldHave(text(gender));
        $x("//td[text()='Mobile']/following::td[1]").shouldHave(text(mobile));
        $x("//td[text()='Hobbies']/following::td[1]").shouldHave(text(hobby));
        $x("//td[text()='Address']/following::td[1]").shouldHave(text(current_address));
    }
}
