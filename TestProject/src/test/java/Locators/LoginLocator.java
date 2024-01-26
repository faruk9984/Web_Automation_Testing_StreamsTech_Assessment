package Locators;

import base.SetUp;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocator {
    @FindBy(xpath = "//input[@id='email']")
    public static WebElement email;
    @FindBy(xpath = "//input[@id='password']")
    public static WebElement password;
    @FindBy(xpath = "//span[contains(text(),'Sign in')]")
    public static WebElement signin;


}
