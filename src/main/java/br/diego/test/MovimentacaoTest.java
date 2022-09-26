package br.diego.test;

import org.junit.Assert;
import org.junit.Test;

import br.diego.core.BaseTeste;
import br.diego.page.MenuPage;
import br.diego.page.MovimentacaoPage;

public class MovimentacaoTest extends BaseTeste {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movPage = new MovimentacaoPage();
	
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		movPage.setDataMovimentacao("26/09/2022");
		movPage.setDataPagamento("27/09/2022");
		movPage.setDescricao("Movimentação de teste");
		movPage.setInteressado("Henrique");
		movPage.setValor("500");
		movPage.setConta("Conta Simples alterada");
		movPage.setStatusPago();
		movPage.salvar();
		Assert.assertEquals("Movimentação adicionada com sucesso!", movPage.obterMensagemSucesso());
		
	}

}
