package br.com.automacao.projetoQuarentena;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AbreNavegador extends BaseTest {

	@Test
	public void deveAbrirNavegadorEMC() {
		String url = driver.getCurrentUrl();
		System.out.println("Estamos na página:" + url);
		String titulo = driver.getTitle();
		System.out.println("O título da página é:" + titulo);
	}

	@Test
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
				
			
		
		
	}


