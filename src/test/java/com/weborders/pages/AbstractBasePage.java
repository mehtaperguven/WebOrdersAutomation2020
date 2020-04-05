package com.weborders.pages;

import com.weborders.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractBasePage {
//protected is helping to use from the child classes not from everywhere
    protected WebDriver driver=Driver.getDriver();
    protected WebDriverWait wait= new WebDriverWait(driver,20);
    public AbstractBasePage(){//object generator is our Constructor
    PageFactory.initElements(driver,this);//to use @FindBy
}

}
