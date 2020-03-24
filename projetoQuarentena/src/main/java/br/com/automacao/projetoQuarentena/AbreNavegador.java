package br.com.automacao.projetoQuarentena;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AbreNavegador extends BaseTest {

	@Test
	public void deveAbrirNavegador() {
		String url = driver.getCurrentUrl();
		System.out.println("Estams na página;" + url);
		String titulo = driver.getTitle();
		System.out.println("O Titulo da página é;" + titulo);
	}

	@Test
	public void deveInserirValor() {
		WebElement buscaText = driver.findElement(By.name("q"));
		buscaText.sendKeys("Selenium");
		WebElement submitSearchbtn = driver.findElement(By.name("btnK"));
		submitSearchbtn.submit();
	}

	@Test
	public void radiobutton() {
		driver.get("http://TestAutomation.co/webelements");
		java.util.List<WebElement> browserradios = driver.findElements(By.name("browser"));		
		
		for(WebElement radio:browserradios) 
		{
			System.out.println(radio.getAttribute("value"));
			if (radio.getAttribute("value").equals("safari"))
			{
				radio.click();
			}
				
			
		}
		
	}

}
