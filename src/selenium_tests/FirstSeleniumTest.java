package selenium_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSeleniumTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		String expectedName = "Jin Joh";

		try {
			driver.get("file:///Users/bora/Desktop/batch10-html-practice/index.html");

			driver.findElement(By.id("name-input")).sendKeys(expectedName);
			driver.findElement(By.id("name-submit")).click();

			String actualName = driver.findElement(By.cssSelector("#name-display")).getText();

			if (expectedName.equals(actualName)) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail");
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			driver.quit();
		}

	}

}
