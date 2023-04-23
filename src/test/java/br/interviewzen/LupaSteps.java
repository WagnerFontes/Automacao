package br.interviewzen;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.is.En;


public class LupaSteps {

	private static WebDriver driver;
	private LupaPage page;

	// **** Clicar no icone lupa ****

	@Given("que o usuario clique no icone de lupa")
	public void queOUsuarioCliqueNoIconeDeLupa() {
		page.setClicarLupa();	

	}
	@Then("deve apesenta uma bara de pesquisa")
	public void deveApesentaUmaBaraDePesquisa() {
		Assert.assertTrue(driver.findElement(By.id("search-field")).isSelected());	

	}
	@End("o botão pesquisar")
	public void oBotãoesquisar() {
		Assert.assertTrue(driver.findElement(By.className("search-submit")).isSelected());	

	}
	
	// **** Clicar no botao pesquisar sem digitar na barra de pesquisa ****
	
	@Given("que o usuario clicou no botao de lupa sem digitar na barra de pesquisa")
	public void queOUsuarioClicouNoBotaoDePesquisarSemDigitarNaBarraDePesquisa() {
		page.setCliqueBotaoPesquisar();	

	}
	@Then("o usuario é redirecionado para a tela com o logo agi")
	public void oUsuarioERedirecionadoParaAOutraTela() {
		Assert.assertTrue(driver.findElement(By.class("archive-title")).isSelected());
	}
}
