package steps;

import base.BaseSteps;
import base.Utils;
import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.LoginPage;
import pages.RegisterPage;

import java.util.Locale;

public class RegisterSteps extends BaseSteps {
    Faker faker = new Faker(Locale.forLanguageTag("pt-BR"));
    String name = faker.name().fullName();
    String email = Utils.getRandomEmail();
    String password = "Teste1234";

    RegisterPage page = new RegisterPage();
    LoginPage pageLogin = new LoginPage();

    @Given("the user is on the registration screen")
    public void theUserIsOnTheRegistrationScreen() {
        page.accessPageRegister();
    }

    @When("to fill in the fields nome, email e senha")
    public void toFillInTheFieldsNomeEmailESenha() {
        page.setName(name);
        page.setEmail(email);
        page.setPassword(password);
        page.setConfirmPassword(password);
        screenshot();
    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {
        page.clickBtnRegister();
    }

    @When("press enter")
    public void pressEnter() {
        page.pressEnter();
    }

    @Then("the user is redirected to the login page")
    public void theUserIsRedirectedToTheLoginPage() {
        Assert.assertTrue(pageLogin.validateLoginPage("https://adopet-tau.vercel.app/login"));
        screenshot();
    }

    @When("fill in name {string}")
    public void fillInName(String name) {
        page.setName(name);
    }

    @When("fill in email {string}")
    public void fillInEmail(String email) {
        page.setEmail(email);
    }

    @When("fill in password {string}")
    public void fillInPassword(String password) {
        page.setPassword(password);
    }

    @When("fill in confirm password {string}")
    public void fillInConfirmPassword(String password) {
         page.setConfirmPassword(password);
    }

    @Then("it should display the message {string}")
    public void itShouldDisplayTheMessage(String msg) {
        Assert.assertEquals(msg, page.msgError());
        screenshot();
    }
}
