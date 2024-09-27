package steps;

import base.BaseSteps;
import io.cucumber.java.en.*;
import org.junit.Assert;
import pages.InitialPage;

public class InitialSteps extends BaseSteps {

    InitialPage page = new InitialPage();

    @Given("the user accesses the home page of the site")
    public void theUserAccessesTheHomePageOfTheSite() {
        page.openPage();
    }

    @Then("the page should contain the text {string}")
    public void thePageShouldContainTheText(String msg) {
        Assert.assertEquals(msg, page.msgWelcome());
        screenshot();
    }

    @And("the text {string}")
    public void theText(String text) {
        Assert.assertEquals(text, page.textDescription());
        screenshot();
    }

    @Then("the page should contain a link with text {string}")
    public void thePageShouldContainALinkWithText(String link) {
        Assert.assertEquals(link, page.validateLinkLogin());
        screenshot();
    }

    @Then("the page should contain a link {string}")
    public void thePageShouldContainALink(String link) {
        Assert.assertEquals(link, page.validateLinkCadastro());
        screenshot();
    }
}