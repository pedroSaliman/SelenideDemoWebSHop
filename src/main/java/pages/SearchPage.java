package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class SearchPage {
    public static SearchPage getInstance(){
        return new SearchPage();
    }
    private static final SelenideElement desktp=$(byXpath("//a[normalize-space()='Build your own cheap computer']"));
    private static final SelenideElement usedphone=$(byXpath("//a[normalize-space()='Used phone']"));
    private static final  SelenideElement elct=$(byXpath("//li[@class='inactive']//a[normalize-space()='Electronics']"));
    private static final  SelenideElement cellphone=$(byXpath("//a[@title='Show products in category Cell phones'][normalize-space()='Cell phones']"));
    public ProductPage clicktoproductpage(){
        desktp.shouldBe(visible).click();
        return new ProductPage();
    }
    public ProductPage clickasus(){
        elct.shouldBe(visible).click();
        cellphone.shouldBe(visible).click();
        usedphone.shouldBe(visible).click();
        return new ProductPage();
    }
}
