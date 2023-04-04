package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class ComparePage {

public static ComparePage getInstance(){
    return new ComparePage();
}
    private static final SelenideElement Clear = $(byXpath("//a[normalize-space()='Clear list']"));
    private static final SelenideElement Message = $(byXpath("//div[@class='page-body']"));

    public String Text() {

        return Message.shouldBe(visible).text();

    }

    public void RemoveProduct() {

Clear.shouldBe(visible).click();

    }
}