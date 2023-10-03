package in.amazon.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestSignInPage {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		// locating the dropdown that has sign in button -> signin - accounts and lists
		
        WebElement e1 = driver.findElement(By.xpath("//*[@class='nav-line-2 ']"));
		
        Actions a = new Actions(driver);
		
        a.moveToElement(e1).perform();
		
        Thread.sleep(3000);
		
        driver.findElement(By.linkText("Sign in")).click();
		
		// Inspect the Email and continue button on sign page
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_email")).sendKeys("pruthvishreesk58@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
		// inspect password input box and click on sign button
		
		driver.findElement(By.id("ap_password")).sendKeys("12345");
		
		driver.findElement(By.id("signInSubmit")).click();
		
		// fetch the error text
		
		String text = driver.findElement(By.xpath("//div[@class='a-box-inner a-alert-container']/descendant::span")).getText();
		
		System.out.println("Error text is >> " + text);
		
		driver.close();
		
	}

}
