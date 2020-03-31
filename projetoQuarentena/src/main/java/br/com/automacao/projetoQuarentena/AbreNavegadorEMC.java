package br.com.automacao.projetoQuarentena;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AbreNavegadorEMC extends BaseTest {

	@Test
	public void deveAbrirNavegadorEMC() {
		String url = driver.getCurrentUrl();
		System.out.println("Estamos na página:" + url);
		String titulo = driver.getTitle();
		System.out.println("O título da página é:" + titulo);
		;

	}

	/*@Test
	public void deveInserirValorEMC() {
		WebElement buscaTextEMC = driver.findElement(By.name("q"));
		buscaTextEMC.sendKeys("Selenium");
		WebElement submitSearchbtnEMC = driver.findElement(By.name("btnK"));
		submitSearchbtnEMC.submit();
	}

	@Test
	public void radiobuttonEMC() {
		driver.get("http://TestAutomation.co/webelements");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
		WebElement name = driver.findElement(By.name("yourname"));
		name.sendKeys("Eden");
		name.clear();
		name.sendKeys("Eden Coimbra");
		System.out.println(name.isDisplayed());
		System.out.println(name.isEnabled());
		System.out.println(name.isSelected());
		WebElement nickname = driver.findElement(By.id("nickname"));
		nickname.sendKeys("EdenMC");
		
		java.util.List<WebElement> browserradios = driver.findElements(By.name("browser"));
		for (WebElement radio : browserradios) {
			System.out.println(radio.getAttribute("value"));
			if (radio.getAttribute("value").equals("safari")) {
				radio.click();
			}
		}
		
		
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("explibutton")));
		driver.findElement(By.id("explibutton")).click();
	}
	@Test
	
	public void loginfacebook () {
				
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("myown xpath");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@value='Entrar']")).click();		
	}*/
	@Test
	
	public void loginJulio() {
		driver.get("http://www.juliodelima.com.br/taskit/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Sign in")).click();
		WebElement formularioSignInBox = driver.findElement(By.id("signinbox"));
		formularioSignInBox.findElement(By.name("login")).sendKeys("julio0001");
		formularioSignInBox.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.linkText("SIGN IN")).click();		
		WebElement me = driver.findElement(By.className("me"));
		String textElementMe = me.getText();
		assertEquals("Hi, Julio", textElementMe);
	}
	}

	

