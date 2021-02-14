package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MessagePage extends PageBase {
    public MessagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy (css = ".compose-windows input")
    WebElement toField;

    @FindBy (css = "[role=\"textbox\"]")
    WebElement textField;

    @FindBy (className = "button2_primary")
    WebElement sendButton;

    public void inputTo(String to) {
        inputTextToField(toField, to);
    }

    public void inputMessageText(String text) {
        inputTextToField(textField, text);
    }

    public void clickOnSendButton() {
        clickOnElement(sendButton);
    }

    public void waitUntilMessagePageIsLoaded() throws InterruptedException {
        Thread.sleep(5000);
    }

    public void waitUntilMessageSending() throws InterruptedException {
        Thread.sleep(5000);
    }
}
