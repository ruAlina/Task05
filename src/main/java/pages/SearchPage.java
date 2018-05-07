package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import steps.BaseSteps;

import static org.junit.Assert.assertTrue;

public class SearchPage extends BasePageObject {

    @FindBy(xpath = "//a[@class='_1z9VjXlbXw']")
    WebElement button;

    @FindBy(xpath = "//label[contains(@class, 'radio-button__radio radio-button__radio_side_right')]")
    WebElement listButton;

    @FindBy(xpath = "//div[contains(@class,'n-snippet-list ')]")
    WebElement shopItemsWrapper;

    @FindBy(xpath = "//button[@class='button button_theme_normal button_arrow_down button_size_s select__button i-bem button_js_inited']")
    WebElement buttonShowSelectCount;

    @FindBy(xpath = "//div[@class='select__list']")
    WebElement selectCount;

    @FindBy(xpath = "//input[@id='header-search']")
    WebElement item;

    @FindBy(xpath = "//span[@class='search2__button']//button[@role='button']")
    WebElement find;

    @FindBy(xpath = "//h1[@class='title title_size_28 title_bold_yes']")
    WebElement found;


    public SearchPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void pushButton() {
        click(button);
    }

    public void pushListButton() {
        click(listButton);
        new Actions(BaseSteps.getDriver()).pause(3000).build().perform();
    }

    public void changeCountSetting(int count) {
        click(buttonShowSelectCount);
        click(selectCount.findElement(By.xpath("./div[contains(span/text(),'" + count + "')]")));
        new Actions(BaseSteps.getDriver()).pause(3000).build().perform();
    }

    public int countShopItems() {
        return shopItemsWrapper.findElements(By.xpath("./div[contains(@class, 'n-snippet-card2 ')]")).size();
    }

    private String getElement() {
        return shopItemsWrapper.findElements(By.xpath("./div[contains(@class, 'n-snippet-card2 ')]")).get(0)
                .findElement(By.xpath(".//div[contains(@class,'n-snippet-card2__title')]/a")).getText();
    }

    public String findFirst() {
        String firstName = getElement();
        item.clear();
        item.sendKeys(firstName);
        click(find);
        return firstName;
    }

    private String foundElement() {
        return found.getText();
    }

    public void comparison(String oldName) {
        String foundName = foundElement();
        assertTrue(String.format("Ожидаемый товар - [%s]. Найденный товар - [$s]", oldName, foundName), oldName.equals(foundName));
    }

}
