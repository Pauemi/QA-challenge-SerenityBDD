package com.example.saucedemo.tasks;

import com.example.saucedemo.ui.LoginPage;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Authenticate {
    public static Task with(String user, String pass) {
        return Task.where("{0} logs in",
                Open.url("https://www.saucedemo.com/"),
                WaitUntil.the(LoginPage.USERNAME, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(user).into(LoginPage.USERNAME),
                Enter.theValue(pass).into(LoginPage.PASSWORD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
