package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.PaginaDosGmail;


public class EnviarCorreoQuestion implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(PaginaDosGmail.MENSAJE_RECIBIDOS).viewedBy(actor).asString().trim();
	}
	
	public static EnviarCorreoQuestion veoElMensaje() {
		return new EnviarCorreoQuestion();
	}
	
}
