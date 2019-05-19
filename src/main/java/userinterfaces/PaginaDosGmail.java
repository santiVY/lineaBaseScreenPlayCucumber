package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class PaginaDosGmail {
	public static final Target MENSAJE_RECIBIDOS = Target.the("mensaje de privacidad en la pantalla principal").locatedBy("//h2[contains(text(), \"Se han detectado problemas de seguridad\")]");
}
