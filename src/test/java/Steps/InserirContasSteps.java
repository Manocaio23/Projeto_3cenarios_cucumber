package Steps;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.InserirContaPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;
import junit.framework.Assert;

public class InserirContasSteps {
	private  InserirContaPage p1;
	private  WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		p1=new InserirContaPage(driver);
	}
	
	
	@Given("que estou acessando a aplicacao")
	public void que_estou_acessando_a_aplicacao() {
		p1.acessarPagina();
	}

	@When("informo o usuario {string}")
	public void informo_o_usuario(String string) {
		p1.informarNomeUsuario(string);
	}

	@When("a senha {string}")
	public void a_senha(String string) {
	   p1.informarSenha(string);
	}

	@When("seleciono entrar")
	public void seleciono_entrar() {
	   p1.botaoEntrar();
	}

	@Then("visualizo a pagina inicial")
	public void visualizo_a_pagina_inicial() {
		p1.PaginaInicialLogin();
	}

	@When("seleciono Contas")
	public void seleciono_contas() {
	    p1.selecionarConta();
	}

	@When("seleciono Adicionar")
	public void seleciono_adicionar() {
		p1.selecionoAdicionar();
	}

	@When("informo a conta {string}")
	public void informo_a_conta(String string) {
	    p1.InformoAConta(string);
	}

	@When("seleciono Salvar")
	public void seleciono_salvar() {
	   p1.botãoSalvar();
	}

	@Then("a conta e inserida com sucesso")
	public void a_conta_e_inserida_com_sucesso() {
	    p1.ContaInseridaComSucesso();
	}
	
	@Then("sou notificar que o nome da conta é obrigatório")
	public void sou_notificar_que_o_nome_da_conta_é_obrigatório() {
		p1.NomeDeContaObrigatório();
	}
	
	@Then("sou notificado que já existe uma conta com esse nome")
	public void sou_notificado_que_já_existe_uma_conta_com_esse_nome() {
		p1.jaExistemUmaContaComMesmoNome();
	}
	
	@After(order= 1)
	public void print(Scenario cenario) {
		

	
	}
	
	@After (order =0)
	public void fecharBrowser() {
		
		driver.quit();
	}
	


}
