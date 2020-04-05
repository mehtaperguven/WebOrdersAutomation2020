package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id = "ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id = "ctl00_MainContent_password")
    private WebElement password;

    public void login(){//default login() method

    String usernameValue= ConfigurationReader.getProperty("username");
    String passwordValue=ConfigurationReader.getProperty("password");
    userName.sendKeys(usernameValue);
    password.sendKeys(passwordValue, Keys.ENTER);

    }


public void login(String usernameValue,String passwordValue){//login() method that asks for entries

    userName.sendKeys(usernameValue);
    password.sendKeys(passwordValue, Keys.ENTER);

}

}
