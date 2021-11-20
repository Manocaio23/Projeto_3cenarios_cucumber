
Feature: Cadastrar conta 

Scenario: Cadastrar novo usuário

Given que estou na tela do sistema 
When clico em "Novo usuário?"
And verifico o fomulario 
And preencho nome "mano caio1" e email "caio1@manocaio.com"
And senha "123456"
And clico no botão Cadastrar
Then devo ver a mensagem "Usuário inserido com sucesso" 


