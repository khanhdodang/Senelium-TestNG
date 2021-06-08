package Pages;

import Locators.LoginLocators;
import Objects.Account;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{
    static WebDriver driver;
    public LoginPage(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, LoginLocators.class);
    }

    /**
     * Login into heroku website with an account
     *
     * @param account
     */
    public void login(Account account) {
        this.setText(LoginLocators.txt_username, account.getUsername());
        this.setText(LoginLocators.txt_password, account.getPassword());
        this.click(LoginLocators.btn_Login);
    }

    public String getMessage() {
        return this.getTextFromElement(LoginLocators.label_message);
    }
}
