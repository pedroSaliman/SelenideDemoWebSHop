package test;

import com.codeborne.selenide.Configuration;
import data.Podam;

import org.testng.annotations.BeforeSuite;
import pages.Constant;
import pojo.Data;

import static com.codeborne.selenide.Selenide.open;
public class TestBase {
    protected final Data employee = Podam.getRandomEmployeeDetails();
    @BeforeSuite

    public void setup(){
        Configuration.browser=Constant.browser;
        open(Constant.URL);
    }
}
