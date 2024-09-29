package steps;

import base.BaseSteps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;

public class LoginSteps extends BaseSteps {

    LoginPage page = new LoginPage();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        page.accessPageLogin();
    }

    @And("fill in password with {string}")
    public void fillInPasswordWith(String password) {
        page.setPassword(password);
    }

    @And("clicks on the login button")
    public void clicksOnTheLoginButton() {
         page.clickBtnToEnter();
    }

    @Then("it should display the message error {string}")
    public void itShouldDisplayTheMessageError(String msg) {
        Assert.assertEquals(msg, page.msgError());
        screenshot();
    }
}
