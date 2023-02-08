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
	
	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListar();
		contasPage.clicarAlterarConta("Conta Simples");
		contasPage.setNome("Conta Simples alterada");
		contasPage.salvar();
		Assert.assertEquals("Conta alterada com sucesso!", contasPage.obterMensagemSucesso());
	}
	
	@Test
	public void testInserirContaMesmoNome() {
		menuPage.acessarTelaInserirConta();
		contasPage.setNome("Conta Simples alterada");
		contasPage.salvar();
		Assert.assertEquals("Já existe uma conta com esse nome!", contasPage.obterMensagemErro());
	}
	
	@Test
	public void testExcluirContaComMovimentacao() {
		menuPage.acessarTelaListar();
		contasPage.clicarExcluirConta("Conta Simples alterada");
		Assert.assertEquals("Conta em uso na movimentações", contasPage.obterMensagemErro());
	}

}
