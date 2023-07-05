package com.hrm.pages;

import com.hrm.base.TestBase;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {

    @FindBy(name = "username")
    private WebElement usernameElement;

    @FindBy(css = "input[name=\"password\"]")
    private WebElement passwordElement;

    @FindBy(css = "button[type=\"submit\"]")
    private WebElement loginButton;


    public LoginPage()
    {
        PageFactory.initElements(driver, this);
    }
    //Actions:
    public String validateLoginPageTitle(){
        return driver.getTitle();
    }
    public HomePage login(String un, String pwd){
        usernameElement.sendKeys(un);
        passwordElement.sendKeys(pwd);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", loginButton);

        return new HomePage();
    }

    /*public PIMPage loginToPIMPage() {
        usernameElement.sendKeys(Info.userName);
        passwordElement.sendKeys(Info.password);
        loginButton.click();

        return PageFactory.initElements(Browser.driver, PIMPage.class);
    }*/



}
