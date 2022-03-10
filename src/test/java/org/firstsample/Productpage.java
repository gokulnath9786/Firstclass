package org.firstsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productpage extends BaseClass {
public Productpage() {
PageFactory.initElements(driver, this);
}
@FindBy(xpath="//button[@class='_2KpZ6l _2doB4z']") 
private WebElement btncancel;

@FindBy(name="q")
private WebElement productname;

@FindBy(xpath="//button[@type='submit']")
public WebElement searchbtn;


@FindBy(xpath="(//div[contains(text(),'iPhone')])[2]")
public WebElement allphones1;

@FindBy(xpath="(//div[contains(text(),'iPhone')])[3]")
public WebElement allphones2;

public WebElement getBtncancel() {
	return btncancel;
}

public WebElement getProductname() {
	return productname;
}
public WebElement getSearchbtn() {
	return searchbtn;
}
public WebElement getAllphones1() {
	return allphones1;
}
public WebElement getAllphones2() {
	return allphones2;
}


}

