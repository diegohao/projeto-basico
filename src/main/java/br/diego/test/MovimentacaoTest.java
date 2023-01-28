package br.diego.test;

import java.util.Arrays;
import java.util.Date;

import org.junit.Assert;
import org.junit.Test;

import com.sun.tools.javac.util.List;

import br.diego.core.BaseTeste;
import br.diego.page.MenuPage;
import br.diego.page.MovimentacaoPage;
import br.diego.utils.DataUtils;

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
	
	@Test
	public void testCamposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movPage.salvar();
		java.util.List<String> erros = movPage.obterErros();
		Assert.assertTrue(erros.containsAll(Arrays.asList(
				"Data da Movimentação é obrigatório", "Data do pagamento é obrigatório",
				"Descrição é obrigatório", "Interessado é obrigatório", 
				"Valor é obrigatório", "Valor deve ser um número")));
		Assert.assertEquals(6, erros.size());
	}
	
	@Test
	public void testInserirMovimentacaoFutura() {		
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(2);
		
		movPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		movPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		movPage.setDescricao("Movimentação de teste");
		movPage.setInteressado("Henrique");
		movPage.setValor("500");
		movPage.setConta("Conta Simples alterada");
		movPage.setStatusPago();
		movPage.salvar();
		java.util.List<String> erros = movPage.obterErros();
		Assert.assertTrue(erros.contains("Data da Movimentação deve ser menor ou igual à data atual"));
		Assert.assertEquals(1, erros.size());
	}
}
