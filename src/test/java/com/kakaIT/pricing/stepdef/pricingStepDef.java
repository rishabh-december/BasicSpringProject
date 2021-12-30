package com.kakaIT.pricing.stepdef;

import com.kakaIT.pricing.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

public class pricingStepDef{
//    @Autowired
//    LoginPage loginPage;

    @Value("${myName.user}")
    String myNme;

    @Given("User wants to login")
    public void givenUserWantsToLogin() {
//        loginPage.Login("rishabh","password");
//        loginPage.ClickLogin();

        System.out.println(myNme);
    }

    @When("User ID is available")
    public void whenUserIdIsAvailable() {
        System.out.println("User ID is available - Step definition##");
    }


}
