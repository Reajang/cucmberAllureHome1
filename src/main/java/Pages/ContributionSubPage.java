package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ContributionSubPage extends BasePage {
    private WebElement baseElement = new ContributionPage().getCalcResult();

    WebElement stavka = baseElement.findElement(By.xpath("//span[@class='js-calc-rate']"));
    WebElement snatie = baseElement.findElement(By.xpath("//span[@class='js-calc-result']"));
    WebElement popolnenie = baseElement.findElement(By.xpath("//span[@class='js-calc-replenish']"));
    WebElement nachisleno = baseElement.findElement(By.xpath("//span[@class='js-calc-earned']"));

    public WebElement getStavka() {
        return stavka;
    }

    public WebElement getSnatie() {
        return snatie;
    }

    public WebElement getPopolnenie() {
        return popolnenie;
    }

    public WebElement getNachisleno() {
        return nachisleno;
    }
    public List<WebElement> getAllElements(){
        List<WebElement> res = new ArrayList<>();
        res.add(stavka);
        res.add(snatie);
        res.add(popolnenie);
        res.add(nachisleno);
        return res;
    }
}
