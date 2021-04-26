import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorrectCredentials {
    public String function1(WebDriver driver, String Username, String Pass) {
        driver.findElement(By.id("txtUsername")).click();
        driver.findElement(By.id("txtUsername")).sendKeys(new CharSequence[]{Username});
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(new CharSequence[]{Pass});
        driver.findElement(By.name("Submit")).click();
        String validText = driver.getTitle();
        return validText;
    }

}
