package task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.PaginaPrincipalGmail;

import static org.openqa.selenium.Keys.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IniciarSesionGmailTask implements Task{
	private String correo;
	private String contrasena;
	
	public IniciarSesionGmailTask(String correo, String contrasena) {
		this.correo = correo;
		this.contrasena = contrasena;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Enter.theValue(correo).into(PaginaPrincipalGmail.ENTREDA_CORREO),
				Click.on(PaginaPrincipalGmail.BOTON_SIGUIENTE),
				Enter.theValue(contrasena).into(PaginaPrincipalGmail.ENTRADA_CONTRASEÑA).thenHit(ENTER)
				);
	}
	
	 public static IniciarSesionGmailTask conLaInformacionDeCorreoContrasena(String correo, String contrasena)  {
	        return instrumented(IniciarSesionGmailTask.class, correo, contrasena);
	 } 

}
