package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver2 = new ChromeDriver(); driver 2 type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();// maximiser la fenetre

		String titlePage = driver.getTitle();
		System.out.println("le title est:" + titlePage);
		if (titlePage.equals("OrangeHRM")) {
			System.out.println("le test est reusi:");
		} else {
			System.out.println("le test a echoue");

		}
	}

}
