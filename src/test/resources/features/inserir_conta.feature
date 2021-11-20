Feature: Cadastro de contas

Como um usuario 
Gostaria de cadastrar contas
Para que eu possa distribuir meu dinheiro de uma forma mais organizada

Background:
Given que estou acessando a aplicacao
When informo o usuario "caio1@manocaio.com"
And a senha "123456"
And seleciono entrar
Then visualizo a pagina inicial
When seleciono Contas
And seleciono Adicionar


Scenario: Deve inserir uma conta com sucesso

And informo a conta "Conta de Teste caio9"
And seleciono Salvar
Then a conta e inserida com sucesso

Scenario: Não deve inserir uma conta sem nome

And seleciono Salvar
Then sou notificar que o nome da conta é obrigatório


Scenario: Não deve inserir uma conta com nome já existente

And informo a conta "Conta de Teste caio9"
And seleciono Salvar
Then sou notificado que já existe uma conta com esse nome
