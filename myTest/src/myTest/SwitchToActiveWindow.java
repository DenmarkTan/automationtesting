package myTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class SwitchToActiveWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/switch-window");
		
		WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
		newTabButton.click();
		//set original open window
		String originalHandle = driver.getWindowHandle();
		//change to other open window
		for (String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		//switch back to original open window
		driver.switchTo().window(originalHandle);
		driver.quit();
	}
}
