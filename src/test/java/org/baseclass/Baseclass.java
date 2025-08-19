package org.baseclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Baseclass {
	public static WebDriver driver;

	public static void browserLaunch() {
		driver = new ChromeDriver();
	}

	public static WebElement findElementByid(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;
	}

	public static void ddnByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

}
