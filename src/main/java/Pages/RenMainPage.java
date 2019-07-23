package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class RenMainPage extends BasePage{
    @FindBy(xpath = "//div[@class='service']")
    private List<WebElement> menu;
    @FindBy(xpath = "//div[@class='service']//div[contains(text(), 'Вклады')]/..")
    private WebElement contr;

    public List<WebElement> getMenu() {
        return menu;
    }

    public WebElement getContr() {
        return contr;
    }
}
