package br.ufc.samquest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;


import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import br.ufc.model.QuestionnaireModel;

/*
 * 
CLASSE TESTE CRIADA PARA GARANTIR O FUNDIONAMENTO DAS PRINCIPAIS OPERAÇÕES
SOBRE OS QUESTIONARIOS E A MANUTENÇÃO DE SUAS TAREFAS.

@author João Vitor


*/

public class TestQuestionare {
		
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
		
		// ADICIONANDO TASKS AOS QUESTIONARIOS CRIADOS //
		
		quest.setTasks(tasks);
		quest2.setTasks(tasks);
		
		
	}
	
	
	
	@After
	public void tearDown() {
		
		// LIMPEZA DE CENÁRIO //
		
		quest.setTasks(null);
		quest2.setTasks(null);
		
	}
	
	

	/* NESSE METODO IREMOS VERIFICAR SE AS TASKS FORAM ADICIONADOS CORRETAMENTE
	BUSCANDO NO ARRAY PELO NOME DA TAREFA QUE ESTA SENDO TESTADA  */
	
	@Test
	public void validandoTasks() {
		
	// ====== EXECUÇÃO ======= //
	
	String t = quest.getTasks().get(0);
	String ta = quest.getTasks().get(1);
	String tas = quest.getTasks().get(2);
	String task = quest.getTasks().get(3);
		
	// ====== VERIFICAÇÃO ====== //
	
	assertEquals(quest.getTasks().get(0), t);
	assertEquals(quest.getTasks().get(1), ta);
	assertEquals(quest.getTasks().get(2), tas);
	assertEquals(quest.getTasks().get(3), task);
	
	
	
	
	}
	
	
	/* NESSE METODO IREMOS VERIFICAR SE AO REMOVERMOS UMA TASK ATRELADA A
	  UM QUESTIONARIO, SE ELE FOI REALMENTE EXCLUIDO.
	*/
	@Test
	public void removendoTasks() {
		
		// ====== EXECUÇÃO ====== //
		
		quest.getTasks().remove(0);
		quest.getTasks().remove(2);
		
		// ====== VERIFICAÇÃO ====== //
	
		assertThat(quest.getTasks().size(), is(2));
		
		
	}
	
}
