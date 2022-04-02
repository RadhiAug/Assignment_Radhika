package week2.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) throws InterruptedException  {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(text(),'Create New Account')]")).click();
		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("radhika");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("augustine");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9568378091");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("testnew56");
		
		WebElement dropdown = driver.findElement(By.xpath("//Select[@aria-label='Day']"));
		Select DD = new Select(dropdown);
		DD.selectByValue("15");
		
		WebElement dropdown1 = driver.findElement(By.xpath("//Select[@aria-label='Month']"));
		Select DD1 = new Select(dropdown1);
		DD1.selectByVisibleText("Aug");
		
		WebElement dropdown2 = driver.findElement(By.xpath("//Select[@aria-label='Year']"));
		Select DD2 = new Select(dropdown2);
		DD2.selectByVisibleText("2022");
		
		
	}
}
