package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class FilterPage extends BasePageObject {

    @FindBy(xpath = "//input[@id='glf-pricefrom-var']")
    WebElement priceFrom;

    @FindBy(xpath = "//div[@class='main']")
    public WebElement brand;

    @FindBy(xpath = "//a[contains(span/text(),'Показать подходящие')]")
    WebElement apply;


    public FilterPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void stepSelectPriceFrom(String value) {
        priceFrom.clear();
        priceFrom.sendKeys(value);
        priceFrom.sendKeys(Keys.RETURN);
    }

    public void stepSelectBrand(String menuItem) {
        click(brand.findElement(By.xpath(".//label[text()='" + menuItem + "']")));
    }

    public void stepPushButton() {
       click(apply);
    }


}
