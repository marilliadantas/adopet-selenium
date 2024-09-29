package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private String urlLogin = "https://adopet-tau.vercel.app/login";
    private By inputEmail = By.id("email");
    private By inputPassword = By.id("pass");
    private By buttonToEnter = By.cssSelector("button[type=\"submit\"]");
    private By msgError = By.cssSelector("p[class=\"error\"]");

    public boolean validateLoginPage(String url) {
        String urlAtual = getCurrentUrl();
        return urlAtual.equals(url);
    }

    public void accessPageLogin() {
        visitPage(urlLogin);
    }

    public void setPassword(String password) {
        fill(inputPassword, password);
    }

    public void clickBtnToEnter() {
        click(buttonToEnter);
    }

    public String msgError() {
        waitElementVisible(msgError, 10);
        return getValueByText(msgError);
    }

}