package br.diego.test;

import org.junit.Test;

import br.diego.core.BaseTeste;
import br.diego.core.Propriedades;
import br.diego.page.HomePage;
import br.diego.page.MenuPage;
import junit.framework.Assert;

public class SaldoTest extends BaseTeste {
	HomePage page = new HomePage();
	MenuPage menu = new MenuPage();
	
	@Test
	public void SaldoTest() {
		menu.acessarTelaPrincipal();
		Assert.assertEquals("500.00", page.obterSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}

}
