Feature: Pesquisar
	Como um usuario 
	Eu fazer umapesquisa no site
	Para eu encontrar mais facil o que os produos no site
	
Scenario: Clicar no icone lupa 
	Given que o usuario clique no icone de lupa 
	Then deve apesenta uma bara de pesquisa 
	And o botão pesquisar
	
Scenario: Clicar no botao pesquisar sem digitar na barra de pesquisa 
	Given que o usuario clicou no botao pesquisar sem digitar na barra de pesquisa
	Then o usuario é redirecionado para a outra tela