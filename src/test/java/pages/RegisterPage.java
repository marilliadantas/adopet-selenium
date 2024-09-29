package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class RegisterPage extends BasePage {
    private String url = "https://adopet-tau.vercel.app/cadastro";
    private By inputName = By.id("name");
    private By inputEmail = By.id("email");
    private By inputPassword = By.id("pass-create");
    private By inputConfirmPass = By.id("pass-confirm");
    private By btnRegister = By.cssSelector("button[type=\"submit\"]");
    private By msgError = By.cssSelector("p[class=\"error\"]");

    public void accessPageRegister() {
        visitPage(url);
    }

    public void setName(String name) {
       fill(inputName, name);
    }

    public void setEmail(String email) {
        fill(inputEmail, email);
    }

    public void setPassword(String password) {
        fill(inputPassword, password);
    }

    public void setConfirmPassword(String password) {
        fill(inputConfirmPass, password);
    }

    public void clickBtnRegister() {
        click(btnRegister);
    }

    public String msgError() {
        waitElementVisible(msgError, 10);
        return getValueByText(msgError);
    }
}