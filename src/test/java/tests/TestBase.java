package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

public class TestBase {
    WebDriver driver;
    String login = "olga.test@internet.ru";
    String password = "ZXC123987654";


    @BeforeMethod(alwaysRun= true)
    public void setup(Method method, Object[] parameter){
       ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=1920,1200");
        driver = new ChromeDriver(options);
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://mail.ru/");
    }

    @AfterMethod
    public void quit(ITestResult result){
        driver.quit();
    }
}
