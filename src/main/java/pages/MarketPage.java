package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage {

    @FindBy(xpath = "//ul[@class='topmenu__list']")
    WebElement menuItems;

    @FindBy(xpath = "//span[contains(span/text(),'Да, спасибо')]")
    WebElement moscow;

    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectMarketItem(String menuItem, String menuSubItem) {
        if (moscow != null) {
            moscow.click();
        }
        Actions action = new Actions(BaseSteps.getDriver());
        WebElement mainMenuItem = menuItems.findElement(By.xpath(".//li[@data-department='" + menuItem + "']"));
        action.moveToElement(mainMenuItem).pause(3000).moveToElement(mainMenuItem.findElement(By.xpath(".//a[contains(text(),'" + menuSubItem + "')]"))).click().build().perform();
    }
}
