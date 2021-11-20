# language: pt
# encoding: utf-8
Funcionalidade: Formulário Facebook

  Cenário: 
    Dado que esteja na pagina de cadastro
    Quando preencho os dados de "nome" , "sobrenome"
    E "email" e "repetir e-mail"
    E "senha" e  "nascimento"
    E "Masuclino"
    Então aparecer mensagem de cadastro
