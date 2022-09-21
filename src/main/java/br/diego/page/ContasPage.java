package br.diego.page;

import org.openqa.selenium.By;

import br.diego.core.BasePage;

public class ContasPage extends BasePage {
	
	public void setNome(String nome) {
		escrever("nome", nome);
	}
	
	public void salvar() {
		clicarBotao(By.xpath("//button[.='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterTexto(By.xpath("//div[@class='alert alert-success']"));
	}

}
