package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class PageBase {
  protected WebDriver driver;

  public PageBase(WebDriver driver) {
    this.driver = driver;
  }


  void waitUntilElementVisible (WebElement element, int time){
      new WebDriverWait(driver, time).until(ExpectedConditions.visibilityOf(element));
  }

  void inputTextToField(WebElement element, String text) {
      element.click();
      element.clear();
      element.sendKeys(text);
  }

  void clickOnElement(WebElement element){
      element.click();
  }



}
