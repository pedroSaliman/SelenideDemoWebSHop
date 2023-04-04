package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class MyAccountPage {
public static MyAccountPage getInstance(){
    return new MyAccountPage();
}

    private static final SelenideElement Result=$(byXpath("//div[@class='result']"));
    public String message(){
        return Result.shouldBe(visible).text();

    }
}
