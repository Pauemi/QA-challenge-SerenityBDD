package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.CartPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ProceedToCheckout {
    public static Task now() {
        return Task.where("{0} proceeds to checkout",
                WaitUntil.the(CartPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CartPage.CHECKOUT_BUTTON)
        );
    }
}
