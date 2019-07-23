package Pages;

import cucumber.api.java.After;
import cucumber.api.java.bs.A;
import org.junit.AfterClass;
import org.junit.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;


public class BasePage {
    WebDriver driver = DriverManager.getDriver();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

    public WebElement findElemByName(List<WebElement> elements, String name) {
        for (WebElement x : elements) {
            if (x.getText().equalsIgnoreCase(name)) {
                clickElem(x);
                return x;
            }
        }
        Assert.fail("Не найден элемент " + name);
        return null;
    }

    public void clickElem(WebElement element) {
        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(element)).click();
    }

    public void fillField(WebElement element, String text) {
        clickElem(element);
        element.sendKeys(text);
    }

    public void choisInSelect(WebElement element, String text) {
        Select select = new Select(element);
        select.selectByValue(text);
    }
    public void checkText(WebElement element, String text){
        Assert.assertEquals(text, element.getText());
    }
    public void waitAMinute(WebElement element){
        new WebDriverWait(driver, 3).until(ExpectedConditions.elementToBeClickable(element));


    }
    @After
    public void quit(){
        DriverManager.closeDriver();
    }

}
