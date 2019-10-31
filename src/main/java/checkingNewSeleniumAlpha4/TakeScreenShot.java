package checkingNewSeleniumAlpha4;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenShot {




	static WebDriver driver;



	public static void main(String[] args) throws IOException {


		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		UtilityForElement U = new UtilityForElement(driver);
		U.waitForPageLoad(20);

		driver.get("https://poshmark.com/");

	

		driver.manage().window().fullscreen();

		By signUp = By.xpath("//a[contains(text(),'Sign up')]");
		U.waitforElementPresent(signUp, 20);
		WebElement signUp1 = driver.findElement(signUp);
		signUp1.click();


		By first_name = By.xpath("//input[@id=\"sign_up_form_first_name\"]");
		U.waitforElementPresent(first_name, 5);
		WebElement firstname = driver.findElement(first_name);
		firstname.clear();
		firstname.sendKeys("Jeyhun");


		By last_name = By.xpath("//input[@id=\"sign_up_form_last_name\"]");
		U.waitforElementPresent(last_name, 0);
		WebElement lastname = driver.findElement(last_name);
		lastname.clear();
		lastname.sendKeys("Aliyev");
		U.takeScreenShot("poshmark");









		driver.quit();




	}

}
