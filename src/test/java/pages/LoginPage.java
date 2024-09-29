package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private By buttonEntrar = By.cssSelector("button[type=\"submit\"]");

    public String validateLoginPage() {
        waitElementVisible(buttonEntrar, 10);
        return getValueByText(buttonEntrar);
    }
}