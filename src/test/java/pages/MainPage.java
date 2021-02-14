package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase {
    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(name = "login")
    WebElement loginField;

    @FindBy (css = "[data-testid=\"enter-password\"]")
    WebElement enterPasswordButton;

    @FindBy (name = "password")
    WebElement passwordField;

    @FindBy (css = "[data-testid=\"login-to-mail\"]")
    WebElement loginButton;

    public void inputLogin(String login) {
        inputTextToField(loginField, login);
    }

    public void clickOnEnterPasswordButton() {
        clickOnElement(enterPasswordButton);
    }

    public void inputPassword(String password) {
        waitUntilElementVisible(passwordField, 10);
        inputTextToField(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }
}
