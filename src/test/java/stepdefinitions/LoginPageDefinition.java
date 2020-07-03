package stepdefinitions;

import elements.LoginElements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageDefinition extends LoginPage {

    @Given("^User opens Amazon website$")
    public void user_opens_Amazon_website() {
        openWebsite();
    }

    @When("^User navigates to Login page$")
    public void user_navigates_to_Login_page() {

    }

    @When("^User writes the valid username as '(\\w+)'$")
    public void user_writes_the_valid_username_as(String string) {

    }

    @When("^User navigates to password page with clicking the button$")
    public void user_navigates_to_password_page_with_clicking_the_button() {

    }

    @Then("^Password pages is displayed$")
    public void password_pages_is_displayed() {

    }
}
