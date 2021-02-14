package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserPage extends PageBase {
    public UserPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (xpath = "//span[contains(text(),'Написать письмо')]")
    WebElement newMessageButton;


    public void clickOnNewMessageButton() {
        clickOnElement(newMessageButton);
    }

    public void waitUntilUserPageIsLoaded() throws InterruptedException {
        Thread.sleep(10000);
    }
}
