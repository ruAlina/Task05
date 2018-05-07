package steps;

import pages.MarketPage;
import ru.yandex.qatools.allure.annotations.Step;

public class MarketSteps {

    @Step("Выбран пункт меню {0} и подпункт {1}" )
    public void stepSelectMarketItem(String menuItem, String menuSubItem) {
        new MarketPage().selectMarketItem(menuItem, menuSubItem);
    }

}
