package com.base.classes;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {
	
	public static WebDriver driver;
	
	public static WebDriver browser_Launch(String name) {
		
		if (name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\chromedriver.exe");
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		driver = new ChromeDriver(options);
		}
		else if (name.equals("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\Users\\Man Bala\\eclipse-workspace\\selenium_project\\Driver_main\\msedgedriver.exe");
			
	    EdgeOptions options = new EdgeOptions();
	    options.addArguments("incognito");
	    driver = new EdgeDriver(options);
		}
		return driver;
	}
	
	public static void maximize(WebDriver d) {
		d.manage().window().maximize();
	}

	public static void close(WebDriver d) {
		d.close();
	}

	public static void switchto(WebDriver d) {
		d.switchTo();
	}

	public static void url(WebDriver d, String url) {
		d.get(url);
	}

	public static void title(WebDriver d) {
		d.getTitle();
	}

	public static void currect_Url(WebDriver d) {
		d.getCurrentUrl();
	}

	public static void pagesource(WebDriver d) {
		d.getPageSource();
	}

	public static void send_keys(WebElement e, String value) {
		e.sendKeys(value);
	}

	public static void click(WebElement e) {
		e.click();
	}

	public static void get_Text(WebElement e) {
		e.getText();
	}

	public static void get_Attribut(WebElement e, String name) {
		e.getAttribute(name);
	}

	public static void isdisplayed(WebElement e) {
		e.isDisplayed();
	}

	public static void isenabled(WebElement e) {
		e.isEnabled();
	}

	public static void isselected(WebElement e) {
		e.isSelected();
	}

	public static void clear(WebElement e) {
		e.clear();
	}

	public static void accept(WebDriver d, Alert a) {
		d.switchTo().alert();
		a.accept();
	}

	public static void screenshot(WebDriver d) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) d;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File location = new File(
				"C:\\Users\\Man Bala\\eclipse-workspace\\Maven_Project\\screenshot maven.screenshot.png");
		FileUtils.copyFile(source, location);
	}

	public static void selectbyvalue(WebElement d, String value) {
		Select s = new Select(d);
		s.selectByValue(value);
	}

	public static void selectbyindex(WebElement d, int value) {
		Select s = new Select(d);
		s.selectByIndex(value);
	}

	public static void selectbyvisibletext(WebElement d, String value) {
		Select s = new Select(d);
		s.selectByVisibleText(value);
	}

	public static boolean ismultiple(WebElement d) {
		Select s = new Select(d);
		boolean multiple = s.isMultiple();
		return multiple;
	}

	public static void frame_Index(WebDriver d, int f) {
		d.switchTo().frame(f);
	}

	public static void frame_Name(WebDriver d, String f) {
		d.switchTo().frame(f);
	}

	public static void frame_webelement(WebDriver d, String f) {
		d.switchTo().frame(f);
	}

	public static void javascript_Click(WebElement d) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].click()", d);
	}

	public static void javascript_Scrollintoview(WebElement d) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].scrollintoview()", d);
	}

	public static void javascript_Highlightawebelement(WebElement d) {
		JavascriptExecutor js = (JavascriptExecutor) d;
		js.executeScript("arguments[0].setAttribute('style','color=green')", d);
	}

	public static void actions_click(WebDriver d, WebElement a) {
		Actions f = new Actions(d);
		f.click(a).build().perform();
	}

	public static void context_Click(WebDriver driver, WebElement element) {
		Actions f = new Actions(driver);
		f.contextClick(element).build().perform();
	}

	public static void double_Click(WebDriver driver, WebElement element) {
		Actions f = new Actions(driver);
		f.doubleClick(element).build().perform();
	}

	public static void movetoelement(WebDriver driver, WebElement element) {
		Actions f = new Actions(driver);
		f.moveToElement(element).build().perform();
	}

	public static void robot_Up() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_UP);
		r.keyRelease(KeyEvent.VK_UP);
	}

	public static void robot_down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void robot_Enter() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

	public static void implicit_Wait(WebDriver driver, int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}

	public static void explicit_Wait(WebDriver driver, int seconds) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
	}

}
