package org.firstsample;

import java.awt.AWTException;
import java.awt.List;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Date;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.bytebuddy.asm.Advice.Enter;

public class Firstsampleproject extends BaseClass { 
	
private static final int Enter = 0;
@BeforeClass
public static void beforeclass() {
	System.out.println("beforeclass");
browserLaunch("Chrome");
implicitwait(5);

}
@Before
public void before() {
System.out.println("before");
System.out.println("start time"+ new Date());
}
@Test
public void test1() throws AWTException {
System.out.println("test1");
urllaunch("https://www.flipkart.com/");
Productpage p = new Productpage();
click(p.getBtncancel());
sendkeys(p.getProductname(), "iphone");
click(p.searchbtn);
//click(p.getAllphones1());
//click(p.getAllphones2());

java.util.List<WebElement> list = driver.findElements(By.className("_4rR01T"));
System.out.println(list.size());
System.out.println("=====      ===");
System.out.println("=====      ===");

for (WebElement names : list) {
	String name = names.getText();
	System.out.println(name);
}

//WebElement three = driver.findElement(By.xpath("(//div[contains(text(),'iPhone')])[4]"));
//click(three);
//three.getAttribute("title");
//String name1 = three.getText();
//System.out.println(name1);
	


}

@After
public void after() {
	System.out.println(" ==     ==  ");
System.out.println("after");
System.out.println("end date"+ new Date());
}
@AfterClass
public static void afterclas() {
System.out.println("AFTERCLASS");
//quit();
}
}
