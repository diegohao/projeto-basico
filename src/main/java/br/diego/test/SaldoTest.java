package br.diego.test;

import org.junit.Test;

import br.diego.core.BaseTeste;
import br.diego.page.HomePage;
import junit.framework.Assert;

public class SaldoTest extends BaseTeste {
	HomePage page = new HomePage();
	
	@Test
	public void SaldoTest() {
		Assert.assertEquals("500.00", page.obterSaldoConta("Conta Simples alterada"));
	}

}
