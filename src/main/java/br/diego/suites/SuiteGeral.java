package br.diego.suites;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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

}
