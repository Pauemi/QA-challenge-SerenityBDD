package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InventoryPage {
    public static final Target ADD_BACKPACK    = Target.the("add backpack").located(By.id("add-to-cart-sauce-labs-backpack"));
    public static final Target ADD_BIKE_LIGHT  = Target.the("add bike light").located(By.id("add-to-cart-sauce-labs-bike-light"));
    public static final Target CART_LINK       = Target.the("cart link").located(By.cssSelector(".shopping_cart_link"));
}
