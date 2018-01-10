package com.iitworkforce.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PatientLoginPage {
WebDriver driver;

By Username = By.name("username");
By Password = By.name("password");
By LoginButton = By.name("submit");
By RegisterButton = By.xpath("//*[@id='login']/form/p[7]/a/input");

public PatientLoginPage (WebDriver driver){
this.driver = driver;
}
public void typeUsername (String uname){
driver.findElement(Username).sendKeys(uname);
}
public void typePassword (String pword){
driver.findElement(Password).sendKeys(pword);	
}
public void clickLoginButton (){
driver.findElement(LoginButton).click();
}
public void clickRegisterButton (){
driver.findElement(RegisterButton).click();

}

}
