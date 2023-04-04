package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pojo.Data;
import pojo.EmailGenerate;

import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;
public class RegisterPage {
    public static RegisterPage  getInstance(){
        return new RegisterPage();
    }

    private static final SelenideElement Gender= $(byXpath("//input[@id='gender-male']"));
    private static final SelenideElement fName=$(byXpath("//input[@id='FirstName']"));
    private static final SelenideElement lName=$(byXpath("//input[@id='LastName']"));
    private static final SelenideElement Email=$(byXpath("//input[@id='Email']"));
    private static final SelenideElement Password=$(byXpath("//input[@id='Password']"));
    private static final SelenideElement ConfirmPassword=$(byXpath("//input[@id='ConfirmPassword']"));
    private static final SelenideElement Submit=$(byXpath("//input[@id='register-button']"));

    public MyAccountPage RegisterProcess(Data data){
        Gender.shouldBe(visible).click();
        fName.shouldBe(visible).setValue(data.getFname());
        lName.shouldBe(visible).setValue(data.getLname());
        Email.shouldBe(visible).setValue(EmailGenerate.Email());
        Password.shouldBe(visible).setValue(data.getPassword());
        ConfirmPassword.shouldBe(visible).setValue(data.getPassword());
        Submit.shouldBe(visible).click();
        return new MyAccountPage();
    }
}
