import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testcase2 {

    public String emptyfields(WebDriver driver, String Username, String Pass)
    {
        driver.findElement(By.id("txtUsername")).click();
        driver.findElement(By.id("txtUsername")).sendKeys(Username);
        driver.findElement(By.id("txtPassword")).click();
        driver.findElement(By.id("txtPassword")).sendKeys(Pass);
        driver.findElement(By.name("Submit")).click();
        String invalidText2 = driver.findElement(By.id("spanMessage")).getText();

        return invalidText2;
    }
}
