package steps;

import base.BaseSteps;
import io.cucumber.java.en.*;
import pages.RegisterPage;

public class registerSteps extends BaseSteps {

    RegisterPage page = new RegisterPage();

    @Given("the user is on the registration screen")
    public void theUserIsOnTheRegistrationScreen() {
        page.accessPageRegister();
    }

    @When("to fill in the fields")
    public void toFillInTheFields() {
        page.setName("João");
        page.setEmail("teste@teste.com");
        page.setPassword("1234Teste");
        page.setConfirmPassword("1234Teste");
    }

    @And("click on the register button")
    public void clickOnTheRegisterButton() {
        page.clickBtnRegister();
    }

    @Then("it should display the message")
    public void itShouldDisplayTheMessage() {

    }
}
