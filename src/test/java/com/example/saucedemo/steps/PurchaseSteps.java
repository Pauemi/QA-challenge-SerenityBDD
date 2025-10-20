package com.example.saucedemo.steps;

import com.example.saucedemo.tasks.*;
import com.example.saucedemo.ui.CheckoutCompletePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.annotations.Managed;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.ensure.Ensure.that;

public class PurchaseSteps {

    @Managed(driver = "chrome")
    WebDriver browser;

    Actor user = Actor.named("Standard User");

    @Given("que el usuario abre la aplicación e inicia sesión")
    public void open_and_login() {
        user.can(BrowseTheWeb.with(browser));
        user.attemptsTo(
                Authenticate.with("standard_user", "secret_sauce")
        );
    }

    @When("agrega productos al carrito y completa el checkout")
    public void add_and_checkout() {
        user.attemptsTo(
                AddItemsToCart.backpackAndBikeLight(),
                GoToCart.view(),
                ProceedToCheckout.now(),
                FillCheckoutInformation.with("Emilia", "Gonzalez", "170301"),
                FinishPurchase.now()
        );
    }

    @Then("ve el mensaje de confirmación de compra")
    public void sees_confirmation() {
        user.attemptsTo(
                that(CheckoutCompletePage.COMPLETE_HEADER).text()
                        .contains("THANK YOU FOR YOUR ORDER")
        );
    }
}
