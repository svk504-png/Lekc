package org.example.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import io.qameta.allure.Description;
import org.openqa.selenium.support.ui.ExpectedCondition;

import java.awt.*;
import java.time.Duration;

import static com.codeborne.selenide.Selenide.element;
import static io.qameta.allure.Allure.step;


import static com.codeborne.selenide.Selenide.$;

@Epic("Функционал пользователя")
@Feature("Первичный запуск")

public class YandexPage {

    SelenideElement textInput = $(By.name("text"));
    SelenideElement Button = $(By.className("search3__button"));
    SelenideElement Redlable = $(By.className("HeaderLogo"));


    @Step("Открываем страницу авторизации")
    public YandexPage openYandexPage() {
        Selenide.open("https://ya.ru/");
        return this;
    }

    @Step("Вводим слово в поисковую строку")
    public YandexPage setTextInput(String text) {
        textInput.setValue(text);
        return this;
    }

    @Step("Нажимаем кнопку Найти")
    public YandexPage click() {
        Button.shouldBe(Condition.enabled,Duration.ofSeconds(120));
        Button.click();
        return this;
    }

    @Step("проверить, что в левом верхнем углу страницы отображается красный значок")
    public YandexPage isDisplayed() {
        Redlable.shouldBe(Condition.enabled, Duration.ofSeconds(120));
        return this;
    }
}


