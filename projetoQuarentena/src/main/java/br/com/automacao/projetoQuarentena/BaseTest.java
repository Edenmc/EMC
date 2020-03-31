package br.com.automacao.projetoQuarentena;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class BaseTest 
{
	WebDriver driver;
	
	public BaseTest() {
		System.setProperty("webdriver.chrome.drive","C:\\Users\\EMCI7\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@AfterClass
	public void encerra() {
		//driver.quit();
	}
    
}