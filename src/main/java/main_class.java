import com.sun.org.apache.xerces.internal.impl.dv.dtd.IDREFDatatypeValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class main_class {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\browserdriver\\chromedriver.exe");
        WebDriver wb =new ChromeDriver();
        wb.get("https://opensource-demo.orangehrmlive.com/");

        //case 1
        LoginHRM lg =new LoginHRM();
        String invalidText = lg.invalidCredentials(wb,"wwww","rrrr");
        if(invalidText.equalsIgnoreCase("Invalid credentials")){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        //case 2
        testcase2 ts= new testcase2();
        String invalidText2 = ts.emptyfields(wb,"","");
        if(invalidText2.isEmpty()){
            System.out.println("Fail");
        }


        // case 3
        CorrectUserIncorrectPass obj=new CorrectUserIncorrectPass();
        String function2=obj.function2(wb,"Admin","30249234");
        if (function2.equalsIgnoreCase("Invalid credentials"))
        {
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }

        // case 3
        CorrectCredentials cc=new CorrectCredentials();
        String function1= cc.function1(wb,"Admin","admin123");
        if (function1.equalsIgnoreCase("OrangeHRM")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Fail, try again!!!");
        }


    }
}

