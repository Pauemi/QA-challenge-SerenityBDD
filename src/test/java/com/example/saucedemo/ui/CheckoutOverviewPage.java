package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {
    public static final Target FINISH_BUTTON =
            Target.the("botón Finish").located(By.id("finish"));
}
