package Steps;


import Pages.*;
import cucumber.api.java.After;
import cucumber.api.java.ru.Допустим;
import cucumber.api.java.ru.Тогда;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CucumberSteps {

    @After
    public void close(){
        DriverManager.closeDriver();
    }

    @Допустим("Перейти по сслылке")
    public void goToUrl(){
        DriverManager.initDriver();
    }
    @Допустим("Перейти в меню Вклады")
    public void goToContributions(){
        RenMainPage renMainPage = new RenMainPage();
        renMainPage.clickElem(renMainPage.getContr());
    }
    @Допустим("Выбрать {string}")
    public void choisCurrency(String string){
        ContributionPage contributionPage = new ContributionPage();
        WebElement element = contributionPage.findElemByName(contributionPage.getCurrency(), string);
        contributionPage.clickElem(element);
    }
    @Допустим("Сумма вклада {string}")
    public void contrValue(String value){
        ContributionPage contributionPage = new ContributionPage();
        contributionPage.fillField(contributionPage.getFirstContr(), value);
    }
    @Допустим("Срок {string} месяцев")
    public void selectLimit(String limit){
        ContributionPage contributionPage = new ContributionPage();
        contributionPage.choisInSelect(contributionPage.getSelectLimit(), limit);
    }
    @Допустим("Ежемесячное пополнение {string}")
    public void plusOnMonth(String value){
        ContributionPage contributionPage = new ContributionPage();
        contributionPage.fillField(contributionPage.getReplenish(), value);
    }
    @Допустим("Отметить Ежемесячная капитализация")
    public void setCapitalization(){
        ContributionPage contributionPage = new ContributionPage();
        contributionPage.clickElem(contributionPage.getCapitalization());
        contributionPage.waitContrTitle();
    }
    @Допустим("Отметить Частичное снятие")
    public void setPartical(){
        ContributionPage contributionPage = new ContributionPage();
        contributionPage.clickElem(contributionPage.getParticalOut());
        contributionPage.waitParticTitle();
    }
    @Тогда("Проверить расчеты по вкладу")
    public void checkData(List<String> arg){
        ContributionSubPage contributionSubPage = new ContributionSubPage();
        List<WebElement> elements = contributionSubPage.getAllElements();
        for(int i = 0; i < arg.size(); i++){
            contributionSubPage.checkText(elements.get(i), arg.get(i));
        }

    }

}
