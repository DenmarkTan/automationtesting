package myTest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dragdrop");
		//image
		WebElement image = driver.findElement(By.id("image"));

		//square
		WebElement box = driver.findElement(By.id("box"));
		
		//Actions
		Actions actions = new Actions(driver);
		// get image to box (source, target)
		actions.dragAndDrop(image,box).build().perform();
		
		driver.quit();
	}
}
