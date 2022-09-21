package br.diego.test;

import org.junit.Assert;
import org.junit.Test;

import br.diego.core.BaseTeste;
import br.diego.page.ContasPage;
import br.diego.page.MenuPage;

public class ContaTest extends BaseTeste {
	
	MenuPage menuPage = new MenuPage();
	ContasPage contasPage = new ContasPage();
	
	@Test
	public void testeInserirConta() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta Simples");
		contasPage.salvar();
		Assert.assertEquals("Conta adicionada com sucesso!", contasPage.obterMensagemSucesso());
	}

}
