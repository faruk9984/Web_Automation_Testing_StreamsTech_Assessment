package Locators;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HrDirectoryLocator {
    @FindBy(xpath = "//p[@class='module-name']")
    public static WebElement clickadminmodule;
    @FindBy(xpath = "//span[contains(text(),'Stakeholder Management')]")
    public static WebElement clickstkmanagement;
    @FindBy(xpath = "//span[normalize-space()='Stakeholder Information']")
    public static WebElement clickstkholder;
    @FindBy(xpath = "//mat-icon[normalize-space()='add']")
    public static WebElement plusiconclick;
    @FindBy(xpath = "//input[contains(@aria-required,'true')]")
    public static WebElement sname;
    @FindBy(xpath = "//div[contains(.,'Select a Gender')]")
    public static List<WebElement> selectgender;
    @FindBy(xpath = "//span[normalize-space()='Male']")
    public static WebElement selectmale;
    @FindBy(xpath = "//div[contains(.,'Select a Country')]")
    public static List<WebElement> selectcountry;
    @FindBy(xpath = "//span[text()=' Rwanda ']")
    public static WebElement selectcountryname;

    @FindBy(xpath = "//div[position()=1]")
    public static List<WebElement> selectlocation;
    @FindBy(xpath = "//mat-icon[normalize-space()='chevron_right']")
    public static WebElement chevronright;
    @FindBy(xpath = "//mat-icon[normalize-space()='chevron_right']")
    public static WebElement chevronright2;
    @FindBy(xpath = "//mat-icon[contains(text(),'chevron_right')]")
    public static WebElement chevronright3;
    @FindBy(xpath = "//mat-icon[contains(.,'chevron_right')]")
    public static WebElement chevronright4;
    @FindBy(xpath = "//span[normalize-space()='Nyakwibereka (Village)']")
    public static WebElement villageclick;

    @FindBy(xpath = "//mat-select[contains(@panelclass,'panel-custom-width stl-slide-tree-box')]")
    public static WebElement location1;
    @FindBy(xpath = "//input[@data-placeholder='Search inside tree']")
    public static WebElement location2;
    @FindBy(xpath = "//span[contains(.,'Nyakwibereka (Village)')]")
    public static WebElement location3;





    @FindBy(xpath = "//div[contains(.,'Select a Stakeholder Type')]")
    public static List<WebElement> clicktype;
    @FindBy(xpath = "//span[starts-with(text(),' STH_Gbon ')]")
    public static WebElement selecttype;

    @FindBy(xpath = "//div[contains(.,'Select a Profession')]")
    public static List<WebElement> selectprofession;
    @FindBy(xpath = "//span[starts-with(text(),' Accountant ')]")
    public static WebElement selectaccountant;

    @FindBy(xpath = "//div[contains(.,'Select an Option')]")
    public static List<WebElement> selectoption;
    @FindBy(xpath = "//span[normalize-space()='Yes']")
    public static WebElement selectyes;

    @FindBy(xpath = "//input[@type='text']")
    public static WebElement typenumber;
    @FindBy(xpath = "//span[normalize-space()='Save']")
    public static WebElement selectsave;





}
