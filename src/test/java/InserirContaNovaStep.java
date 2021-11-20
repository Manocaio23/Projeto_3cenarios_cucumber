

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class InserirContaNovaStep {
	
	private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	@Given("que estou na tela do sistema")
	public void que_estou_na_tela_do_sistema() {
		driver.get("https://seubarriga.wcaquino.me/login");
	}

	@When("clico em {string}")
	public void clico_em(String string) {
	    driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[2]/a")).click();
	    
	}

	@When("verifico o fomulario")
	public void verifico_o_fomulario() {
	   String formulario = driver.findElement(By.xpath("/html/body/div[2]/form/div[1]/label")).getText();
	   Assert.assertEquals("Nome", formulario);
	   
	}

	@When("preencho nome {string} e email {string}")
	public void preencho_nome_e_sobrenome(String string, String string2) {
	   driver.findElement(By.id("nome")).sendKeys(string);
	   driver.findElement(By.id("email")).sendKeys(string2);
	}

	@When("senha {string}")
	public void senha(String string) {
	    driver.findElement(By.id("senha")).sendKeys(string);
	    
	}
	
	@When("clico no botão Cadastrar")
	public void clico_no_botão_cadastrar() {
	    driver.findElement(By.xpath("/html/body/div[2]/form/input")).click();
	}

	@Then("devo ver a mensagem {string}")
	public void devo_ver_a_mensagem(String string) {
	   String texto= driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	   Assert.assertEquals("Usuário inserido com sucesso", texto);
	}
}
