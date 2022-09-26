package br.diego.core;

import static br.diego.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;

import br.diego.page.LoginPage;

public class BaseTeste {
	
	private LoginPage page = new LoginPage();
	
	@Before
	public void inicializa() {
		page.acessarTelaInicial();
		page.setEmail("diego@test.com");
		page.setSenha("123456");
		page.entrar();
	}
	
	@After
	public void finaliza() {
		if(Propriedades.FECHAR_BROWNSER) {
			killDriver();
		}
	}
}
