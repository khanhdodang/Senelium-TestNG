package Locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators {
    @FindBy(id = "username")
    public static WebElement txt_username;
    @FindBy(id = "password")
    public static WebElement txt_password;
    @FindBy(xpath = "//button[@type='submit']")
    public static WebElement btn_Login;
    @FindBy(id = "flash")
    public static WebElement label_message;
}
