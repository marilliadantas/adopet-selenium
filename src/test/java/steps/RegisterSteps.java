package steps;

import base.BaseSteps;
import base.Utils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegisterPage;

public class RegisterSteps extends BaseSteps {

    RegisterPage page = new RegisterPage();
    LoginPage pageLogin = new LoginPage();

    @Given("the user is on the registration screen")
    public void theUserIsOnTheRegistrationScreen() {
        page.accessPageRegister();
    }

    @When("to fill in the fields")
    public void toFillInTheFields() {
        page.setName("João");
        page.setEmail(Utils.getRandomEmail());
        page.setPassword("1234Teste");
        page.setConfirmPassword("1234Teste");
        screenshot();
    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {
        page.clickBtnRegister();
    }

    @Then("the user is redirected to the login page")
    public void theUserIsRedirectedToTheLoginPage() {
        Assert.assertTrue(pageLogin.validateLoginPage("https://adopet-tau.vercel.app/login"));
        screenshot();
    }

    @When("not to fill in the name field")
    public void notToFillInTheNameField() {
        page.setName("");
    }

    @Then("it should display the message {string}")
    public void itShouldDisplayTheMessage(String string) {

    }
}
