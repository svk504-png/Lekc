package org.example;

import org.example.pages.YandexPage;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LekcTest {
    YandexPage yandexPage = new YandexPage();

    @Test
    void test() {
        yandexPage.openYandexPage()
                .setTextInput("погода")
                .click()
                .isDisplayed();
            }
}