package stepdefinitions;

import org.hamcrest.core.StringContains;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import question.EnviarCorreoQuestion;
import task.AbrirElNavegadorTask;
import task.IniciarSesionGmailTask;
import userinterfaces.PaginaPrincipalGmail;


import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


public class EnviarCorreoStepDefinition {
	
	@Managed(driver = "chrome")
	private WebDriver herBrowser;
	private Actor santiago = Actor.named("Santiago");
	
	private PaginaPrincipalGmail paginaGmail;
	
	
	@Before
	public void setup() {
		santiago.can(BrowseTheWeb.with(herBrowser));  
		herBrowser.manage().window().maximize();	
	}
	
	@Given("^juanita abre su navegador en la pagina de Gmail$")
	public void dadoQueAbreElNavegadorEnGmail() throws Exception {
		santiago.wasAbleTo(AbrirElNavegadorTask.at(paginaGmail));   
	}
	
	@When("^inicia sesion en Gmail (.*) y (.*)$")
	public void cuandoIniciatSesionEnGmail(String correo, String contrasena) {
		santiago.attemptsTo(IniciarSesionGmailTask.conLaInformacionDeCorreoContrasena(correo, contrasena));
	}
	
	@Then("^deberia ver un mensaje como (.*)$")
	public void entoncesDeberiaVerUnMensaje(String mensaje) {
		santiago.should(seeThat(EnviarCorreoQuestion.veoElMensaje(), StringContains.containsString(mensaje)));
	}
}
