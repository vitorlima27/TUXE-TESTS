# TUXE-TESTS
JUnit testes da ferramenta TUXE, criada para um trabalho acadêmico da cadeira de Manutenção de Software.

//  ======= Explicando a estrutura dos testes ======  //

Temos três classes codificadas realizandno testes na criação, remoção e gerenciamento 
de questionarios, questões e tarefas.

A classe teste GerenciarQuestionarios serve para testar se os questionarios estão sendo 
atrelados corretamente aos seus pesquisadores.
A classe testeQuestionnaire busca conferir as tarefas atreladas a cada questionário.
A classe testeQuestionnaireTask serve pra conferir os QuestionModel de cada tarefa,
será adicionado algumas funcionalidades, portanto está incompleta.
A classe testeReasearcher ainda não foi codificada.

Utilizei dos métodos @Before e @After para realizar a criação dos cenários e limpeza 
antes e depois de cada método de testes para que não ocorram interferências nas operações
realizadas em cada método de teste.

A classe testClass realiza o teste de todas as classes a partir do método suite.class.


// ======= À fazer =========  //

Terminar a codificação de classes para poder realizar a codificação de testes futuros.
