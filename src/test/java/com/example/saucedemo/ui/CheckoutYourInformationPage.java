package com.example.saucedemo.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutYourInformationPage {
    public static final Target FIRST_NAME = Target.the("first name").located(By.id("first-name"));
    public static final Target LAST_NAME  = Target.the("last name").located(By.id("last-name"));
    public static final Target POSTAL     = Target.the("postal code").located(By.id("postal-code"));
    public static final Target CONTINUE   = Target.the("continue").located(By.id("continue"));
}
