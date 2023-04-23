package br.interviewzen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LupaPage extends LupaSteps {
	private static WebDriver driver;
	public LupaPage(WebDriver driver) {
		super();
		this.driver = driver;
		
	}

	public void setClicarLupa() {
		driver.findElement(By.id("search-open")).click();

	}
	public void setCliqueBotaoPesquisar() {
		driver.findElement(By.className("search-submit")).click();

	}

}
