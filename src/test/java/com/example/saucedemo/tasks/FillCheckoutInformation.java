package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.CheckoutYourInformationPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillCheckoutInformation {
    public static Task with(String firstName, String lastName, String postalCode) {
        return Task.where("{0} fills checkout form",
                WaitUntil.the(CheckoutYourInformationPage.FIRST_NAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(firstName).into(CheckoutYourInformationPage.FIRST_NAME),
                Enter.theValue(lastName).into(CheckoutYourInformationPage.LAST_NAME),
                Enter.theValue(postalCode).into(CheckoutYourInformationPage.POSTAL),
                Click.on(CheckoutYourInformationPage.CONTINUE)
        );
    }
}
