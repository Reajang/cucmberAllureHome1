package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContributionSubPage extends BasePage {
    private WebElement baseElement = new ContributionPage().getCalcResult();

    private WebElement rate = baseElement.findElement(By.xpath("//span[@class='js-calc-rate']"));
    private WebElement forRemov = baseElement.findElement(By.xpath("//span[@class='js-calc-result']"));
    private WebElement refill = baseElement.findElement(By.xpath("//span[@class='js-calc-replenish']"));
    private WebElement accrued = baseElement.findElement(By.xpath("//span[@class='js-calc-earned']"));

    public WebElement getRate() {
        return rate;
    }

    public WebElement getForRemov() {
        return forRemov;
    }

    public WebElement getRefill() {
        return refill;
    }

    public WebElement getAccrued() {
        return accrued;
    }
    public List<WebElement> getAllElements(){
        List<WebElement> res = new ArrayList<>();
        res.add(rate);
        res.add(forRemov);
        res.add(refill);
        res.add(accrued);
        return res;
    }
}
