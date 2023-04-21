package br.interviewzen;

import org.junit.Assert;
import org.openqa.selenium.By;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.is.En;


public class LupaSteps {

	private static WebDriver driver;
	private LupaPage page;

	// **** Cenario: Cadastro com sucesso ****

	@Given("que o usuario clique no icone de lupa")
	public void queOUsuarioCliqueNoIconeDeLupa() {
		page.setClicarLupa();	

	}
	@Then("deve apesenta uma bara de pesquisa")
	public void deveApesentaUmaBaraDePesquisa() {
		Assert.assertTrue(driver.findElement(By.id("search-field")).isSelected());	

	}
	@End("o bot�o pesquisar")
	public void oBot�oesquisar() {
		page.setCliqueBotaoPesquisar();	

	}
	
	// **** Clicar no botao pesquisar sem digitar na barra de pesquisa ****
	
	@Given("que o usuario clicou no botao de lupa sem digitar na barra de pesquisa")
	public void queOUsuarioClicouNoBotaoDePesquisarSemDigitarNaBarraDePesquisa() {
		page.setCliqueBotaoPesquisar();	

	}
	@Then("o usuario � redirecionado para a tela com o logo agi")
	public void oUsuarioERedirecionadoParaAOutraTela() {
		Assert.assertTrue(driver.findElement(By.class("archive-title")).isSelected());
	}
}