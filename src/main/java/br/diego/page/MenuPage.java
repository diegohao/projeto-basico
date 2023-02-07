package br.diego.page;

import br.diego.core.BasePage;

public class MenuPage extends BasePage {
	
	public void acessarTelaInserirConta() {
		clicarLink("Contas");
		clicarLink("Adicionar");
	}
	
	public void acessarTelaListar() {
		clicarLink("Contas");
		clicarLink("Listar");
	}
	
	public void acessarTelaInserirMovimentacao() {
		clicarLink("Criar Movimentação");
	}
	
	public void acessarTelaResumo() {
		clicarLink("Resumo Mensal");
	}

}
