package steps;

import pages.FilterPage;
import ru.yandex.qatools.allure.annotations.Step;

public class FilterSteps {

    @Step("Выбрана сумма")
    public void selectPriceFrom(String menuItem) {
        new FilterPage().stepSelectPriceFrom(menuItem);
    }

    @Step("Выбран производитель ")
    public void selectBrand(String menuItem) {
        new FilterPage().stepSelectBrand(menuItem);
    }

    @Step("Нажата кнопка Показать подходящие")
    public void pushButton() {
        new FilterPage().stepPushButton();
    }
}
