
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class formularioFacebookStep {
	private WebDriver driver;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	@Given("que esteja na pagina de cadastro do Facebook")
	public void que_esteja_na_pagina_de_cadastro_do_facebook() {
		driver.get("https://pt-br.facebook.com/r.php");
	}

	@When("preencho {string} e  {string}")
	public void preencho_e(String string, String string2) {
	   
	}

	@And("preencho {string} e {string}")
	public void preencho_e1(String string, String string2) {
	    
	}

	@And("preencho {string} e data de nascimento")
	public void preencho_e_data_de_nascimento(String string) {
	    
	}

	@And("clico no genero {string}")
	public void clico_no_genero(String string) {
	    
	}

	@Then("aparece mensagem de cadastro")
	public void aparece_mensagem_de_cadastro() {
	   
	}
}
