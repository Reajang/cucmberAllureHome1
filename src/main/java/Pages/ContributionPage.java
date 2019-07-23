package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.List;
import java.util.regex.Pattern;


public class ContributionPage extends BasePage {
    @FindBy(xpath = "//span[@class='calculator__currency-field-btn']")
    private List<WebElement> currency;
    @FindBy(xpath = "//input[@name='amount']")
    private WebElement firstContr;
    @FindBy(xpath = "//select[@class='calculator__slide-input js-slide-value']")
    private WebElement selectLimit;
    @FindBy(xpath = "//input[@name='replenish']")
    private WebElement replenish;
    @FindBy(xpath = "//input[@name='capitalization']/..")
    private WebElement capitalization;
    @FindBy(xpath = "//input[@name='partial_out']/..")
    private WebElement particalOut;
    @FindBy(xpath = "//div[@class='calculator__result-block']/*")
    private WebElement calcResult;
    @FindBy(xpath = "//span[@class='js-deposit-name']")
    private WebElement resultsTable;

    public List<WebElement> getCurrency() {
        return currency;
    }

    public WebElement getFirstContr() {
        return firstContr;
    }

    public WebElement getSelectLimit() {
        return selectLimit;
    }

    public WebElement getReplenish() {
        return replenish;
    }

    public WebElement getCapitalization() {
        return capitalization;
    }

    public WebElement getCalcResult() {
        return calcResult;
    }

    public WebElement getResultsTable() {
        return resultsTable;
    }

    public WebElement getParticalOut() {
        return particalOut;
    }

    /*@Override
    public void waitAMinute(WebElement element) {
        Pattern pattern = Pattern.compile("(Ренессанс Накопительный) | (Без границ)");
        new WebDriverWait(driver, 2).
                until(ExpectedConditions.textMatches(By.xpath("//span[@class='js-deposit-name']"), pattern));
    }*/
    public void waitContrTitle(){
        new WebDriverWait(driver, 2).
                until(ExpectedConditions.textToBePresentInElement(resultsTable, "Ренессанс Накопительный"));
    }
    public void waitParticTitle(){
        new WebDriverWait(driver, 2).
                until(ExpectedConditions.textToBePresentInElement(resultsTable, "Без границ"));
    }
}
