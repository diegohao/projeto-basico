package br.diego.test;

import java.util.List;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import br.diego.core.BaseTeste;
import br.diego.core.DriverFactory;
import br.diego.page.MenuPage;
import br.diego.page.ResumoPage;
import junit.framework.Assert;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ResumoTest extends BaseTeste {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void test1ExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2ResumoMensal() {
		menuPage.acessarTelaResumo();
		
		Assert.assertEquals("Seu Barriga - Extrato", DriverFactory.getDriver().getTitle());
		
		List<WebElement> elementosEncontrados = DriverFactory.getDriver().findElements(By.xpath("//*[@id='tabelaExtrato']/tbody/tr"));
		Assert.assertEquals(0, elementosEncontrados.size());
	}
}
