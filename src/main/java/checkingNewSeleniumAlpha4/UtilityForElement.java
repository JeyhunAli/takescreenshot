package checkingNewSeleniumAlpha4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityForElement {
	
	WebDriver driver;
	WebDriverWait wait;
	public UtilityForElement(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public WebElement getElement(By locator) {
		WebElement element = driver.findElement(locator);
				return element;
	
		
	}
	
	public void waitforElementPresent(By locator, int timeout) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);	
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		
		
		
	}
	
	public void waitForPageLoad(int timeout) {
		 wait = new WebDriverWait(driver, timeout);
		
	}
	
	public void takeScreenShot(String fileName) throws IOException {
		//taking screenShot and storing it as file format with the new name 
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//2. now copy the screenshot to the desired locating using copyfile method 
		FileUtils.copyFile(file, new File(fileName +".jpg" ));
	}
	
	
	//takeElementScreenShot/target/classes" + 
}
