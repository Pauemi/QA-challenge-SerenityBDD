package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.CartPage;
import com.example.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class GoToCart {
    public static Task view() {
        return Task.where("{0} opens the cart",
                WaitUntil.the(InventoryPage.CART_LINK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(InventoryPage.CART_LINK),
                WaitUntil.the(CartPage.CHECKOUT_BUTTON, isVisible()).forNoMoreThan(10).seconds()
        );
    }
}
