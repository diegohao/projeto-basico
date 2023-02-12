package br.diego.suites;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.diego.core.DriverFactory;
import br.diego.page.LoginPage;
import br.diego.test.ContaTest;
import br.diego.test.MovimentacaoTest;
import br.diego.test.RemoverMovimentacaoContaTeste;
import br.diego.test.ResumoTest;
import br.diego.test.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTeste.class,
	SaldoTest.class,
	ResumoTest.class
})
public class SuiteGeral {
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inicializa() {
		page.acessarTelaInicial();
		page.setEmail("di@test.com");
		page.setSenha("123456");
		page.entrar();
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
