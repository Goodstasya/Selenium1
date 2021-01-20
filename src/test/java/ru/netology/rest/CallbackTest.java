package ru.netology.rest;

import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbackTest {

    @Test
    void shouldSubmitRequest(){
        open("http://localhost:9999");

        SelenideElement form= $("[data-test-id=name]");
        form.$(".input__control").setValue("Василий");

        form= $("[data-test-id=phone]");
        form.$(".input__control").setValue("+79270000000");

        form= $("[data-test-id=agreement]");
        form.$(".checkbox__box").click();

        $("[role=button]").click();

        $("[data-test-id=order-success]").shouldHave(exactText("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
