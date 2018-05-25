package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class MainPage {

    private final SelenideElement footer;

    public MainPage() {
        footer = $(".footer__inner");
    }

    @Step("Open {url}")
    public MainPage openMainPage(String url){
        open(url);
        return this;
    }

    @Step("Check the footer is visible")
    public MainPage checkFooterVisible(){
        footer.shouldBe(Condition.visible);
        return this;
    }
}
