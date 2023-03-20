package br.diego.test;

import org.junit.Assert;
import org.junit.Test;

import br.diego.core.BaseTeste;
import br.diego.page.ContasPage;
import br.diego.page.MenuPage;

public class RemoverMovimentacaoContaTeste extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListar();
		contasPage.clicarExcluirConta("Conta com movimentacao");
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}	
	

}
