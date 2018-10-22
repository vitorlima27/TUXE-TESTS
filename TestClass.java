package br.ufc.samquest;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/*
CLASSE CRIADA PARA RODAR TODOS AS CLASSES DE TESTES A PARTIR DO METODO SUITE.CLASS.

@author João Vitor


*/


@RunWith(Suite.class)
@SuiteClasses({/*TestResearcher.class*/ TestQuestionareTask.class, TestQuestionare.class, GerenciarQuestionarios.class})

public class TestClass {

}
