package test;

import org.junit.Assert;
import org.testng.annotations.Test;
import pages.*;

public class TestCases extends TestBase {

    @Test
    public void Register() {
        HomePage.getInstance().regClick().RegisterProcess(employee);
        Assert.assertTrue(new MyAccountPage().message().contains("complete"));
    }

    ///////////////////////////////////////////////////////////////////
    @org.testng.annotations.Test(dependsOnMethods = {"Register"})
    public void Log() {
        HomePage.getInstance().LoginClick().LogIn(employee);
        Assert.assertEquals(new HomePage().Text(), "Log out");

    }


    /*
     *
     *
     *
     * */

    @org.testng.annotations.Test(dependsOnMethods = {"Log"})
    public void Search() {
        HomePage.getInstance().clicksearch(employee).clicktoproductpage();
        Assert.assertTrue(ProductPage.getInstance().message().contains("Build"));
    }

    /*


     *    Compare Case
     *

     * */

    @org.testng.annotations.Test(dependsOnMethods = {"Search"})
    public void CompareCase() {
        ProductPage.getInstance().CompareProduct();
        SearchPage.getInstance().clickasus();
        ProductPage.getInstance().CompareProduct().RemoveProduct();
        org.testng.Assert.assertFalse( ComparePage.getInstance().Text().contains("items"));


    }
}