package org.firstsample;


import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
public static WebDriver browserLaunch(String browsername) {
	switch (browsername) {
	case "Chrome":
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		break;
		
	case "Firefox":
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		break;
		default:
			System.err.println("Invalic browsername");
	}
	return driver;
}

public static void urllaunch(String url) {
	driver.get(url);
driver.manage().window().maximize();
}

public static void implicitwait(long sec) {	
	driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
}
public static void quit() {
	driver.quit();
}
public static void sendkeys(WebElement a, String value) {
	 a.sendKeys(value);
	 }

public static void click(WebElement c) {
	c.click();

}
public static void getcurrenturl() {
	driver.getCurrentUrl();
}

public static void gettitle() {
	driver.getTitle();
	}
public void getattribute(WebElement b) {
	b.getAttribute("value");

}

public static void gettext(WebElement t) {
	t.getText();	
}

public static void movetoelement(WebElement m) {
	Actions a = new Actions(driver);
	a.moveToElement(m);
}

public static void draganddrop(WebElement source, WebElement des) {
	Actions b = new Actions(driver);
	b.dragAndDrop(source, des);

}
public static void selectbyindex(WebElement select, int index) {
	Select s = new Select(select);
    s.selectByIndex(index);
}

public static WebElement findelement(String locator, String locatorvalue ) {
	WebElement e=null;
	if (locator.equals("id")) {
		e= driver.findElement(By.id(locatorvalue));
	}
	else if (locator.equals("name")) {
		e=driver.findElement(By.name(locatorvalue));
	}
	else if (locator.equals("xpath")) {
		e=driver.findElement(By.xpath(locatorvalue));
	}
	return e;
}
//public static void scrolldown(WebElement j) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("argument[0].scrollIntoView(true)", j);
//}
//
//public static void scrollup(WebElement up) {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//js.executeScript("argument[0].scrollIntoView(false)", up);
//}

public static void clear(WebElement cl) {
	cl.clear();
}

}

