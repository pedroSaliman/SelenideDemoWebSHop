package pages;
import com.codeborne.selenide.SelenideElement;
import pojo.Data;


import static com.codeborne.selenide.Condition.visible;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public static HomePage getInstance(){
        return new HomePage();
    }
private static final SelenideElement RegisterButton=$(byXpath("//a[normalize-space()='Register']"));
    private static final SelenideElement Searchbar=$(byXpath("//input[@id='small-searchterms']"));
    private static final SelenideElement LoginButton=$(byXpath("//a[normalize-space()='Log in']"));
    private static final SelenideElement LogoutButton=$(byXpath("//a[normalize-space()='Log out']"));
    private static final SelenideElement acountButtonText=$(byXpath("//a[normalize-space()='Log out']"));
    /////////////Register Click Button///////////////////
    public RegisterPage regClick(){
        RegisterButton.shouldBe(visible).click();

        return new RegisterPage();
    }
    //////////////Search///////
    public SearchPage clicksearch(Data data){
        Searchbar.shouldBe(visible).setValue(data.getProduct()).pressEnter();


        return new SearchPage();
    }
    ///////////////////////////////////////////
    public Login LoginClick(){
        LogoutButton.shouldBe(visible).click();
        LoginButton.shouldBe(visible).click();


        return new Login();
    }
    public String Text(){
        return acountButtonText.text();
    }


}
