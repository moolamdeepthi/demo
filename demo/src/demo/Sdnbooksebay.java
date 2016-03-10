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

public class Sdnbooksebay {
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
	public void ebay(){
		driver.get("http://www.ebay.com");
		driver.findElement(By.xpath(".//*[@id='gh-ac']")).sendKeys("sdn books");
		driver.findElement(By.xpath(".//*[@id='gh-btn']")).click();
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scrFile, new File("Z:\\scr\\ebay.jpG"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
System.out.println("ebay is opened");
System.out.println("ebay opened sucessfully");
	}
}
