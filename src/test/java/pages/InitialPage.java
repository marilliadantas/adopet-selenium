package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class InitialPage extends BasePage {
    private String url = "https://adopet-tau.vercel.app/";
    private By msgWelcome = By.cssSelector("section > h3");
    private By text = By.cssSelector("section > p");
    private By linkLogin = By.cssSelector("a[href=\"/login\"]");
    private By linkCadastro = By.cssSelector("a[href=\"/cadastro\"]");

    public void openPage() {
        visitPage(url);
    }

    public String msgWelcome(){
        waitElementVisible(msgWelcome, 10);
        return getValueByText(msgWelcome);
    }

    public String textDescription(){
        waitElementVisible(text, 10);
        return getValueByText(text);
    }

    public String validateLinkLogin() {
        waitElementVisible(linkLogin, 10);
        return getValueByText(linkLogin);
    }

    public String validateLinkCadastro() {
        waitElementVisible(linkCadastro, 10);
        return getValueByText(linkCadastro);
    }
}
