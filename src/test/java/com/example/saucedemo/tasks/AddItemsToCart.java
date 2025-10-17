package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.InventoryPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class AddItemsToCart {
    public static Task backpackAndBikeLight() {
        return Task.where("{0} adds backpack and bike light",
                WaitUntil.the(InventoryPage.ADD_BACKPACK, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(InventoryPage.ADD_BACKPACK),
                Click.on(InventoryPage.ADD_BIKE_LIGHT)
        );
    }
}
