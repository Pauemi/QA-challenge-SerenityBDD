package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {
    public static final Target CHECKOUT_BUTTON = Target.the("checkout").located(By.id("checkout"));
    public static final Target TITLE           = Target.the("cart title").located(By.cssSelector("span.title"));
}
