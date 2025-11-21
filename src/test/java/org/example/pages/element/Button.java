package org.example.pages.element;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

public class Button {
    public Button(SelenideElement element) {
        this.element = element;
    }
    SelenideElement element;

    public Button click() {
        element.shouldBe(Condition.enabled, Duration.ofSeconds(60));
        element.click();
        return this;
    }
}
