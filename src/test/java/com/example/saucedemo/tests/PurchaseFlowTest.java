package com.example.saucedemo.tests;

import com.example.saucedemo.tasks.*;
import com.example.saucedemo.ui.CheckoutCompletePage;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.ThucydidesWebDriverSupport;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

@ExtendWith(SerenityJUnit5Extension.class)
public class PurchaseFlowTest {

    Actor user = Actor.named("Standard User");

    @Test
    void user_can_complete_purchase_flow() {
        WebDriver browser = ThucydidesWebDriverSupport.getDriver();
        user.can(BrowseTheWeb.with(browser));

        user.attemptsTo(
                Authenticate.with("standard_user", "secret_sauce"),
                AddItemsToCart.backpackAndBikeLight(),
                GoToCart.view(),
                ProceedToCheckout.now(),
                FillCheckoutInformation.with("Emilia", "Camino", "170301"),
                FinishPurchase.now()
        );

        user.attemptsTo(
                that(CheckoutCompletePage.COMPLETE_HEADER).text().contains("Thank you for your order")
        );
    }
}
