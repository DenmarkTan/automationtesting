import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import automatically using webdriver wait
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.ConfirmationPage;
import Pages.FormPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;	
import org.junit.Test; 
import static org.junit.Assert.*;

public class TestObjects {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		
		//call method for submit form
		FormPage formpage = new FormPage();
		formpage.submitForm(driver);
		
		//call method for waiting alert banner
		ConfirmationPage confirmPage = new ConfirmationPage();
		confirmPage.waitForAlertBanner(driver);
	
		
		assertEquals("The form was successfully submitted!", confirmPage.getAlertBannerText(driver));
		driver.quit();	
	}
}
