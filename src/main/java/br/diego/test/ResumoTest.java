package br.diego.test;

import org.junit.Test;

import br.diego.core.BaseTeste;
import br.diego.page.MenuPage;
import br.diego.page.ResumoPage;
import junit.framework.Assert;

public class ResumoTest extends BaseTeste {
	private MenuPage menuPage = new MenuPage();
	private ResumoPage resumoPage = new ResumoPage();
	
	@Test
	public void testExcluirMovimentacao() {
		menuPage.acessarTelaResumo();
		
		resumoPage.excluirMovimentacao();
		Assert.assertEquals("Movimentação removida com sucesso!", resumoPage.obterMensagemSucesso());
	}
	

}
