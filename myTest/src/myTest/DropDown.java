package myTest;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/dropdown");
		
		WebElement dropDownMenu = driver.findElement(By.id("dropdownMenuButton"));
		dropDownMenu.click();
		WebElement autocompleteItem = driver.findElement(By.id("autocomplete"));
		autocompleteItem.click();
		
		driver.quit();
	}
}
