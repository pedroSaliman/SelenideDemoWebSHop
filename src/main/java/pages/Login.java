package pages;

import com.codeborne.selenide.SelenideElement;
import pojo.Data;
import pojo.EmailGenerate;

import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class Login {
    public static Login getInstance(){
        return new Login();
    }



    private static final SelenideElement Email=$(byXpath("//input[@id='Email']"));
    private static final SelenideElement password=$(byXpath("//input[@id='Password']"));
    private static final SelenideElement button=$(byXpath("//input[@value='Log in']"));

    public HomePage LogIn(Data data){
        Email.shouldBe(visible).setValue(EmailGenerate.Email());
        password.shouldBe(visible).setValue(data.getPassword());
        button.shouldBe(visible).click();
        return new HomePage();
    }
}
