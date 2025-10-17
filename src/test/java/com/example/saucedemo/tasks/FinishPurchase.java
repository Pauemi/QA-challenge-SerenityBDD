package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.CheckoutOverviewPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FinishPurchase {
    public static Task now() {
        return Task.where("{0} finishes purchase",
                WaitUntil.the(CheckoutOverviewPage.FINISH_BUTTON, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(CheckoutOverviewPage.FINISH_BUTTON)
        );
    }
}
