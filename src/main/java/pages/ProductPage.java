package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class ProductPage {

public static ProductPage getInstance(){
    return new ProductPage();
}
    private static final SelenideElement Result=$(byXpath("//h1[normalize-space()='Build your own cheap computer']"));
    private static final SelenideElement TextOfCurrency=$(byXpath("//span[text()=' €1548.00 ']"));
    private static final SelenideElement compareLink=$(byXpath("//input[@value='Add to compare list']"));

    public ComparePage CompareProduct(){
        compareLink.shouldBe(visible).click();
        return new ComparePage();
    }
    public ComparePage CompareAnotherProduct(){
        compareLink.shouldBe(visible).click();
        return new ComparePage();
    }


    public String Price(){
        return TextOfCurrency.shouldBe(visible).text();
    }


    public String message(){
return Result.shouldBe(visible).text();
   //     return getText(Result);
    }

}
