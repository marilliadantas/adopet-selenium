package base;

import org.openqa.selenium.JavascriptExecutor;
import support.BrowserFactory;

import java.util.Random;

public class Utils extends BrowserFactory {

    public void scrollDown() throws InterruptedException {
        JavascriptExecutor jse = (JavascriptExecutor) getBrowser();
        jse.executeScript("window.scrollTo(0,10000)");
        Thread.sleep(2000);
    }

    public static String getRandomEmail() {

        String email_int = "qateste_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_int + resultado + email_final;
    }
}
