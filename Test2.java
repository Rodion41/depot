package pack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ChromeDriver driver2 = new ChromeDriver(); driver 2 type chrome uniquement
		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();// maximiser la fenetre
		String codeSource = driver.getPageSource();
		System.out.println("le code de source"+ codeSource);
		if (codeSource.contains("OrangeHRM")) {
			System.out.println("passed");
			}else {
				System.out.println("failed");
			}

		
	}

}
