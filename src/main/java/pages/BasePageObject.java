package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;

public class BasePageObject {

    public BasePageObject() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void click(WebElement element) {
        click(ExpectedConditions.elementToBeClickable(element));
    }

    private void click(ExpectedCondition<WebElement> condition) {
        Wait<WebDriver> wait = new WebDriverWait(BaseSteps.getDriver(), 15, 1000);
        wait.until(condition).click();
    }


}