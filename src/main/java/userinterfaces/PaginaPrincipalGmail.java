package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://accounts.google.com/")

public class PaginaPrincipalGmail extends PageObject{
	
	public static final Target ENTREDA_CORREO = Target.the("campo de entrada del correo").located(By.id("identifierId"));
	public static final Target BOTON_SIGUIENTE = Target.the("clic en el boton siguiente").locatedBy("//span[contains(text(), \"Siguiente\")]");
	public static final Target ENTRADA_CONTRASEÑA = Target.the("campo de entrada para la contraseña").located(By.name("password"));
	
}
