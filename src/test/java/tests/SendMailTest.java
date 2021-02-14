package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pages.MainPage;
import pages.MessagePage;
import pages.UserPage;

public class SendMailTest extends TestBase {
    String to = "ask@quality-lab.ru";
    String text = "Hello!";
    MainPage mainPage;
    UserPage userPage;
    MessagePage messagePage;

    @BeforeMethod
    public void initTest(){
        mainPage = PageFactory.initElements(driver, MainPage.class);
        userPage = PageFactory.initElements(driver, UserPage.class);
        messagePage = PageFactory.initElements(driver, MessagePage.class);
    }

    @Test
    @Parameters({"login", "password"})
    public void sendMailTest(String login, String password) throws InterruptedException {
        mainPage.inputLogin(login);
        mainPage.clickOnEnterPasswordButton();
        mainPage.inputPassword(password);
        mainPage.clickOnLoginButton();
        userPage.waitUntilUserPageIsLoaded();
        userPage.clickOnNewMessageButton();
        messagePage.waitUntilMessagePageIsLoaded();
        messagePage.inputTo(to);
        messagePage.inputMessageText(text);
        messagePage.clickOnSendButton();
        messagePage.waitUntilMessageSending();
        System.out.println("Email sent successfully!");

    }
}
