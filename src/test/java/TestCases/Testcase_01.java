package TestCases;

import Objects.Account;
import Pages.BasePage;
import Pages.LoginPage;
import TestData.Data;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class Testcase_01 {
    WebDriver driver;
    LoginPage loginPage;
    @Parameters({"browser"})
    @BeforeMethod
    public void SetUp(@Optional("chrome") String browser) {
        BasePage basePage = new BasePage(driver);
        driver = basePage.setupDriver(browser);
        loginPage = new LoginPage(driver);
    }

    @AfterMethod
    public void tearDown() {
        loginPage.cleanUp();
    }

    @Test(priority = 0, description = "Verify login successfully")
    public void testLogin_01() {
        Account account = Data.standardUser();
        loginPage.login(account);
        String msg = loginPage.getMessage();
        Assert.assertTrue(msg.contains("You logged into a secure area!"));
    }
}
