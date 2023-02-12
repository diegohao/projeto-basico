package br.diego.core;

import static br.diego.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;

import br.diego.page.LoginPage;

public class BaseTeste {
	
	private LoginPage page = new LoginPage();
	
	@After
	public void finaliza() {
		if(Propriedades.FECHAR_BROWNSER) {
			killDriver();
		}
	}
}
