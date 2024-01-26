package Pages;

import Locators.HrDirectoryLocator;
import credential.LoginCredential;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

public class HrDirectoryLocatorPage extends HrDirectoryLocator {
    WebDriver driver;
    public HrDirectoryLocatorPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    public void CreateEmployee() throws InterruptedException {

        HrDirectoryLocator.clickadminmodule.click();
        String parentWindowHandle = driver.getWindowHandle();

        // Switch to the new tab
        Set<String> windowHandles = driver.getWindowHandles();
        String newTabHandle = null;
        for (String windowHandle : windowHandles) {
            if (!windowHandle.equals(parentWindowHandle)) {
                newTabHandle = windowHandle;
                driver.switchTo().window(newTabHandle);
                break;
            }
        }
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Stakeholder Management')]")));

        HrDirectoryLocator.clickstkmanagement.click();
        Thread.sleep(2000);
        HrDirectoryLocator.clickstkholder.click();
        Thread.sleep(2000);
        HrDirectoryLocator.plusiconclick.click();
        Thread.sleep(2000);
        HrDirectoryLocator.sname.sendKeys(("Stream Tech Exam"));
        Thread.sleep(2000);
        HrDirectoryLocator.selectgender.get(8).click();
        Thread.sleep(1000);
        HrDirectoryLocator.selectmale.click();
        Thread.sleep(2000);
        HrDirectoryLocator.selectcountry.get(8).click();
        Thread.sleep(2000);
        HrDirectoryLocator.selectcountryname.click();
        Thread.sleep(2000);


        HrDirectoryLocator.location1.click();
        Thread.sleep(2000);
        HrDirectoryLocator.location2.sendKeys("Nyakwibereka (Village)");
        Thread.sleep(3000);
        HrDirectoryLocator.location3.click();
        Thread.sleep(200);


//        HrDirectoryLocator.selectlocation.get(93).click();
//        Thread.sleep(2000);
//        HrDirectoryLocator.chevronright.click();
//        Thread.sleep(2000);
//        HrDirectoryLocator.chevronright2.click();
//        Thread.sleep(2000);
//        HrDirectoryLocator.chevronright3.click();
//        Thread.sleep(2000);
//        HrDirectoryLocator.chevronright4.click();
//        Thread.sleep(2000);
//        HrDirectoryLocator.villageclick.click();
//        Thread.sleep(2000);

        HrDirectoryLocator.clicktype.get(8).click();
        Thread.sleep(2000);
        HrDirectoryLocator.selecttype.click();
        Thread.sleep(2000);

        HrDirectoryLocator.selectprofession.get(8).click();
        Thread.sleep(2000);
        HrDirectoryLocator.selectaccountant.click();
        Thread.sleep(3000);



        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement contactNameElem = driver.findElement(By.xpath("//input[@type='text']"));
        js.executeScript("arguments[0].scrollIntoView(true);",contactNameElem);
        Thread.sleep(2000);

        HrDirectoryLocator.selectoption.get(8).click();
        Thread.sleep(2000);
        HrDirectoryLocator.selectyes.click();
        Thread.sleep(2000);

        HrDirectoryLocator.typenumber.sendKeys("01981400668");
        Thread.sleep(2000);
        HrDirectoryLocator.selectsave.click();
        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(parentWindowHandle);
        driver.quit();

    }
}
