package pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver2 = new ChromeDriver(); driver 2 type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		//driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		WebElement logbtn = driver.findElement(By.id("btnLogin"));
		logbtn.click();
		WebElement lienWelcome = driver.findElement(By.id("welcome"));
		lienWelcome.click();

		Thread.sleep(4000);

		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();
	}

}
