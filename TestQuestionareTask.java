package br.ufc.samquest;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufc.model.QuestionModel;
import br.ufc.model.QuestionnaireModel;

/*

CLASSE TESTE CRIADA PARA GARANTIR O FUNCIONAMENTO DAS PRINCIPAIS OPERAÇÕES
SOBRE AS TAREFAS E SOBRE SUAS DIMENÇÕES DE AVALIAÇÕES DE UX

@author João Vitor


*/


public class TestQuestionareTask {
	
	// CRIANDO QUESTIONARIOS A SEREM TESTADOS //
	
		QuestionnaireModel quest = new QuestionnaireModel("Avaliar UX", "DGLSoftwares", "SAUVO");
		QuestionnaireModel quest2 = new QuestionnaireModel("Avaliar UX", "DGLSoftwares", "SAMQUEST");

		
		
		@Before
		public void setUp() {
			
			// ====== MONTAGEM DE CENÁRIO ======= //
			
			// CRIANDO TASKS //
			
			ArrayList<String> tasks = new ArrayList<String>();
			tasks.add("Adicionar");
			tasks.add("Remover");
			tasks.add("Alterar");
			tasks.add("Visualizar");
			
			// CRIANDO QUESTIONMODEL PARA CADA TASK ADICIONADA AO QUESTIONARIO //
			
			ArrayList<QuestionModel> question = new ArrayList<QuestionModel>();
		
			for(String s : tasks) {
				QuestionModel q = new QuestionModel();
				q.setTask(s);
				q.setQuestionnaire(quest);
				question.add(q);
								
			}
						
			
			// ADICIONANDO TASKS AOS QUESTIONARIOS CRIADOS //
			
			quest.setTasks(tasks);
			quest2.setTasks(tasks);
			
			// ADICIONANDO QUESTION AOS QUESTIONARIOS CRIADOS //
			
			quest.setQuestions(question);
			quest2.setQuestions(question);
		}
		
		
		
		@After
		public void tearDown() {
			
			// LIMPEZA DE CENÁRIO //
			
			quest.setTasks(null);
			quest2.setTasks(null);
			
			quest.setQuestions(null);
			quest2.setQuestions(null);
		}

	
		/* NESSE METODO IREMOS VERIFICAR SE AS TASKS E OS QUESTIONS FORAM ADICIONADOS CORRETAMENTE
		BUSCANDO NO ARRAY PELO TAMANHO DO ARRAY DE QUESTIONS ADICIONADAS  */
		@Test
		public void validarQuestion() {
			
			// ====== EXECUÇÃO ====== //
			
			QuestionModel q = new QuestionModel();
			QuestionModel question = new QuestionModel();
			
			q = quest.getQuestions().get(0);
			//q.generateItems();
			question = quest.getQuestions().get(1);
			//question.generateItems();
			
			
			// ====== VERIFICAÇÃO ====== //
			
			assertNotNull(q);
			assertThat(q.getQuestionnaire().getQuestions().size() , is(4));
			//assertNotNull(q.getItems());
			//assertThat(q.getItems().length, is(3));
		
		}
	
}
