package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class InserirContaPage {

	private static final String URL = "https://seubarriga.wcaquino.me/login";
	private WebDriver driver;

	public InserirContaPage(WebDriver driver) {
		this.driver = driver;
	}

	public void informarNomeUsuario(String string) {
		driver.findElement(By.id("email")).sendKeys(string);

	}

	public void informarSenha(String string) {
		driver.findElement(By.id("senha")).sendKeys(string);

	}

	public void acessarPagina() {
		driver.get(URL);

	}

	public void botaoEntrar() {
		driver.findElement(By.xpath("/html/body/div[2]/form/button")).click();
	}

	public void PaginaInicialLogin() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Bem vindo, mano caio1!", texto);

	}

	public void selecionarConta() {
		driver.findElement(By.linkText("Contas")).click();

	}

	public void selecionoAdicionar() {
		driver.findElement(By.linkText("Adicionar")).click();
	}

	public void InformoAConta(String string) {
		driver.findElement(By.id("nome")).sendKeys(string);
	}

	public void botãoSalvar() {
		driver.findElement(By.tagName("button")).click();
	}

//validação cenário1 

	public void ContaInseridaComSucesso() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
		Assert.assertEquals("Conta adicionada com sucesso!", texto);
	}

//vilidação cenário2 

	public void NomeDeContaObrigatório() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Informe o nome da conta", texto);
	}

//validação cenário3 

	public void jaExistemUmaContaComMesmoNome() {
		String texto = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
		Assert.assertEquals("Já existe uma conta com esse nome!", texto);
	}

}
