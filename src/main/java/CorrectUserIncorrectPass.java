import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CorrectUserIncorrectPass {
    public String function2(WebDriver driver, String Username, String Pass)
    {
        driver.findElement(By.id("txtUsername")).click();
        driver.findElement(By.id("txtUsername")).sendKeys(Username);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(Pass);
        driver.findElement(By.name("Submit")).click();
        String wrongPass = driver.findElement(By.id("spanMessage")).getText();

        return wrongPass;
    }
}
