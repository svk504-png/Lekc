package org.example;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.example.pages.YandexPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exist;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


//public class LekcTest {
//    YandexPage yandexPage = new YandexPage();
//
//    @Test
//    void test() {
//        Selenide.sleep(5000);
//        yandexPage.openYandexPage()
//                .setTextInput("погода")
//                .click()
//                .isDisplayed();
//            }
//}
class ExceptionWithTryCatch {
    @Test
    void exception() {
        try {
            System.out.println((String)null);
            Assertions.assertTrue(false);
        }
        catch (NullPointerException e) {
            System.out.println("исключение" + e.getMessage());
        }
        catch (AssertionError error) {
            System.out.println("исключение обработано");
    }
    }
}