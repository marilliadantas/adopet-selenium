package base;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import support.BrowserFactory;

public class BasePage extends BrowserFactory {

    public void visitPage(String url) {
        getBrowser().get(url);
    }

    public void click(By locator) {
        getBrowser().findElement(locator).click();
    }

    public void fill(By locator, String texto){
        getBrowser().findElement(locator).clear();
        getBrowser().findElement(locator).sendKeys(texto);
    }

    public void waitElementVisible(By element, int seconds) {
        wait = new WebDriverWait(getBrowser(), seconds);
        wait.until(ExpectedConditions.visibilityOfElementLocated(element));
    }

    public String getValueByText(By locator){
        return getBrowser().findElement(locator).getText();
    }
}