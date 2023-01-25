package com.trello.step_definitions;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class ExampleStepDef {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("The user is on the login page");
    }
    @When("username is {string} and password is {string}")
    public void username_is_and_password_is(String username, String password) {
        System.out.println("username = " + username);
        System.out.println("password = " + password);
    }
    @Then("{string} is logged in")
    public void user_is_logged_in(String username) {
        Assert.assertEquals(username, username);
    }
    @Then("user is {string}")
    public void user_is(String role) {
        Assert.assertEquals(role, role);
    }
}
