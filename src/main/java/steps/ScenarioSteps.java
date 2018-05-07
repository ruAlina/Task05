package steps;

import cucumber.api.java.en.When;

public class ScenarioSteps {

    MainSteps mainSteps = new MainSteps();
    MarketSteps marketSteps = new MarketSteps();
    SearchSteps searchSteps = new SearchSteps();
    FilterSteps filterSteps = new FilterSteps();

    @When("^выбран пункт меню (.+)$")
    public void selectMainItem(String menuItem) {
        mainSteps.stepSelectMainItem(menuItem);
    }

    @When("^выбран раздел (.+) и подраздел (.+)$")
    public void selectMarketItem(String menuItem, String menuSubItem) {
        marketSteps.stepSelectMarketItem(menuItem, menuSubItem);
    }

    @When("^нажата кнопка Перейти ко всем фильтрам$")
    public void pushButton() {
        searchSteps.stepPushButton();
    }

    @When("^выбрана цена от (.+)$")
    public void selectMItem(String menuItem) {
        filterSteps.selectPriceFrom(menuItem);
    }

    @When("^выбран производитель (.+)$")
    public void selectMnItem(String menuItem) {
        filterSteps.selectBrand(menuItem);
    }

    @When("^нажата кнопка Показать подходящие$")
    public void pushButtonSecond() {
        filterSteps.pushButton();
    }

    @When("^выбрано отображение списком$")
    public void pushButtonSecond2() {
        searchSteps.stepPushListButton();
    }

    @When("^выбрано число товаров на странице (\\d+)$")
    public void changeCountSetting(int count) {
        searchSteps.stepChangeCountSetting(count);
    }
    @When("^проверено ,что элементов (\\d+)$")
    public void countShopItems(int count) {
        searchSteps.stepCountShopItems(count);
    }

    @When("^найден первый товар$")
    public void findFirst() {
        searchSteps.stepFindFirst();
    }
    @When("^выполнена проверка$")
    public void Сomparison() {
        searchSteps.stepСomparison();
    }

}
