package steps;

import pages.SearchPage;
import ru.yandex.qatools.allure.annotations.Step;

import static org.junit.Assert.assertTrue;

public class SearchSteps {

    private String nameToRemember;

    @Step("Нажата кнопка")
    public void stepPushButton() {
        new SearchPage().pushButton();
    }

    @Step("Нажата кнопка")
    public void stepPushListButton() {
        new SearchPage().pushListButton();
    }

    @Step("Выбрано количество элементов {0}")
    public void stepChangeCountSetting(int count) {
        new SearchPage().changeCountSetting(count);
    }

    @Step("Проверено количество элементов {0}")
    public void stepCountShopItems(int count) {
        int actualCount = new SearchPage().countShopItems();
        assertTrue(actualCount == count);
    }

    @Step("Ищется первый товар")
    public void stepFindFirst() {
        nameToRemember = new SearchPage().findFirst();
    }

    @Step("Первый товар найден верно")
    public void stepСomparison() {
        new SearchPage().comparison(nameToRemember);
    }
}
