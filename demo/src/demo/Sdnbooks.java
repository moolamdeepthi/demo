package demo;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sdnbooks {
	public class DifferentWebsites {
	public	 WebDriver driver = new FirefoxDriver();
	public String expectedTitle = null;
	public String actualTitle = null;

	@BeforeMethod      

	public void page() throws AWTException{
		Robot newtab = new Robot();
		newtab.keyPress(KeyEvent.VK_CONTROL);
		newtab.keyPress(KeyEvent.VK_T);
		newtab.keyRelease(KeyEvent.VK_CONTROL);
		newtab.keyRelease(KeyEvent.VK_T);
	}
	@Test(priority=0)
	public void amazon(){
		driver.get("http://www.amazon.com");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("SDN books");
		driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\amazon.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
System.out.println("amazon is opened");

	}}
}
