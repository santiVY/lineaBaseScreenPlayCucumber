package task;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirElNavegadorTask implements Task{
	
	private PageObject pagina;
	
	public AbrirElNavegadorTask(PageObject pagina) {
		this.pagina = pagina;
	}

	@Override
	@Step("{0} goes to #OpenTheBrowser")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(pagina));
	}

	public static AbrirElNavegadorTask at(PageObject pagina) {
		return instrumented(AbrirElNavegadorTask.class, pagina) ;
	}
}
