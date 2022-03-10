package org.firstsample;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allphones extends BaseClass{
	public Allphones() {
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="//div[contains(text(),'iPhone')]")
	public WebElement allphones;
	
	
	
}
