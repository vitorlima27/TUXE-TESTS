package br.ufc.samquest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.hamcrest.Matcher;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufc.model.QuestionnaireModel;
import br.ufc.model.ResearcherModel;

/*
	CLASSE TESTE CRIADA PARA GARANTIR O FUNCIONAMENTO DAS PRINCIPAIS OPERAÇÕES 
SOBRE OS QUESTIONARIOS CRIADOS E FAZER O SEU GERENCIAMENTO PELO PESQUISADOR ATRELADO A ELE.

@author João Vitor


*/
public class GerenciarQuestionarios {
	
	//		CRIANDO O PESQUISADOR QUE VAI GERENCIAR OS QUESTIONARIOS CRIADOS		//
	ResearcherModel r1 = new ResearcherModel("Francisco", "francisco@gmail.com", "ocsicnarf");
	
	// CRIANDO VARIAVEIS GLOBAIS UTILIZADAS //
	
	int quest1 = 0;
	String sQuest1 = "SAUVO";
	int quest2 = 1;
	String sQuest2 = "SAMQUEST";
	
	
	@Before
	public void setUp() {
		
		// MONTAGEM DE CENARIO //
		 		
		// CRIANDO ALGUNS QUESTIONARIOS //
		
		QuestionnaireModel quest = new QuestionnaireModel("Avaliar UX", "DGLSoftwares", "SAUVO");
		QuestionnaireModel quest2 = new QuestionnaireModel("Avaliar UX", "DGLSoftwares", "SAMQUEST");
		
		//	ATRELANDO OS QUESTIONARIOS CRIADOS AO PESQUISADOR	// 
	
		r1.getQuestionnaires().add(quest);
		r1.getQuestionnaires().add(quest2);		

	}
	
	@After
	public void tearDown() {
		
		// 	LIMPEZA DE CENÁRIO 	//
		
		// 	LIMPAR DADOS DE QUESTIONARIOS E PESQUISADORES DO ARQUIVO/ BANCO //
			
		// 	LIMPAR QUESTIONARIOS LIGADOS AOS PESQUISADORES	//
		
		r1.getQuestionnaires().clear();
		
		
	}
	
	
	/* NESSE METODO IREMOS VERIFICAR SE OS QUESTIONARIOS FORAM ADICIONADOS CORRETAMENTE
	BUSCANDO NO ARRAY PELO NOME DA APLICAÇÃO QUE ESTA SENDO TESTADO  */
	
	@Test
	public void validarQuest() {
	
		// 	======= Execução ========	//
		
		QuestionnaireModel questionnaire = r1.getQuestionnaires().get(quest1);
		QuestionnaireModel questionnaire1 = r1.getQuestionnaires().get(quest2);
	
		//   ======= Verificação ======   //
		
		assertEquals(questionnaire.getApplication(), sQuest1);
		
	
	}
	
	/* NESSE METODO IREMOS VERIFICAR SE AO REMOVERMOS UM QUESTIONARIO ATRELADO
	 A UM PESQUISADOR, SE ELE FOI REALMENTE EXCLUIDO E REMOVIDO DO ARQUIVO/BANCO.
	*/
	@Test
	public void removerQuest() {
		
		// ====== EXECUÇÃO ==== //
		
		r1.getQuestionnaires().set(quest2, null);
		
		//  ===== VERIFICAÇÃO ====   //
		
		assertNull(r1.getQuestionnaires().get(quest2));
	}

	


	
	
	
	
	
}
