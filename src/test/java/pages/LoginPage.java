package pages;

import base.BasePage;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    private String urlLogin = "https://adopet-tau.vercel.app/login";
    private By buttonEntrar = By.cssSelector("button[type=\"submit\"]");

    public boolean validateLoginPage(String url) {
        String urlAtual = getCurrentUrl();
        return urlAtual.equals(url);
    }
}