package Pages;

import Locators.LoginLocator;
import credential.LoginCredential;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LoginLocator {
    WebDriver driver;
    LoginCredential loginCredential=new LoginCredential();
    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void doLogin()throws InterruptedException{
        System.out.println("Start Login");
        LoginLocator.email.sendKeys(loginCredential.loginemail);
        Thread.sleep(1000);
        LoginLocator.password.sendKeys(loginCredential.loginpassword);
        Thread.sleep(1000);
        LoginLocator.signin.click();
        Thread.sleep(3000);
    }
}
